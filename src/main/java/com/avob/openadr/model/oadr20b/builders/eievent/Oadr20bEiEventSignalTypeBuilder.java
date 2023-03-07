package com.avob.openadr.model.oadr20b.builders.eievent;

import com.avob.openadr.model.oadr20b.Oadr20bFactory;
import com.avob.openadr.model.oadr20b.ei.*;
import com.avob.openadr.model.oadr20b.emix.ItemBaseType;

import javax.xml.bind.JAXBElement;
import java.util.List;

public class Oadr20bEiEventSignalTypeBuilder {

	private EiEventSignalType eiEventSignalType;

	public Oadr20bEiEventSignalTypeBuilder(String signalId, SignalNameEnumeratedType signalName,
			SignalTypeEnumeratedType signalType, float currentValue) {
		eiEventSignalType = Oadr20bFactory.createEiEventSignalType();
		eiEventSignalType.setCurrentValue(Oadr20bFactory.createCurrentValueType(currentValue));
		eiEventSignalType.setSignalID(signalId);
		eiEventSignalType.setSignalName(signalName.value());
		eiEventSignalType.setSignalType(signalType);
		eiEventSignalType.setIntervals(Oadr20bFactory.createIntervals());
	}

	public Oadr20bEiEventSignalTypeBuilder withItemBase(JAXBElement<? extends ItemBaseType> itemBase) {
		eiEventSignalType.setItemBase(itemBase);
		return this;
	}

	public Oadr20bEiEventSignalTypeBuilder withEiTarget(EiTargetType eiTarget) {
		eiEventSignalType.setEiTarget(eiTarget);
		return this;
	}

	public Oadr20bEiEventSignalTypeBuilder addInterval(IntervalType interval) {
		eiEventSignalType.getIntervals().getInterval().add(interval);
		return this;
	}

	public Oadr20bEiEventSignalTypeBuilder addInterval(List<IntervalType> interval) {
		eiEventSignalType.getIntervals().getInterval().addAll(interval);
		return this;
	}

	public EiEventSignalType build() {
		return eiEventSignalType;
	}

}
