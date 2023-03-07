package com.avob.openadr.model.oadr20b.builders.eievent;

import com.avob.openadr.model.oadr20b.Oadr20bFactory;
import com.avob.openadr.model.oadr20b.ei.*;
import com.avob.openadr.model.oadr20b.oadr.OadrDistributeEventType.OadrEvent;
import com.avob.openadr.model.oadr20b.oadr.ResponseRequiredType;

import java.util.Arrays;
import java.util.List;

public class Oadr20bDistributeEventOadrEventBuilder {

	private OadrEvent event;

	public Oadr20bDistributeEventOadrEventBuilder() {
		event = Oadr20bFactory.createOadrDistributeEventTypeOadrEvent();
	}

	public Oadr20bDistributeEventOadrEventBuilder withActivePeriod(EiActivePeriodType eiActivePeriodType) {
		event.getEiEvent().setEiActivePeriod(eiActivePeriodType);
		return this;
	}

	public Oadr20bDistributeEventOadrEventBuilder addEiEventSignal(EiEventSignalType eiEventSignalType) {
		this.addEiEventSignal(Arrays.asList(eiEventSignalType));
		return this;
	}

	public Oadr20bDistributeEventOadrEventBuilder addEiEventSignal(List<EiEventSignalType> eiEventSignalType) {
		event.getEiEvent().getEiEventSignals().getEiEventSignal().addAll(eiEventSignalType);
		return this;
	}

	public Oadr20bDistributeEventOadrEventBuilder withEiEventBaseline(EiEventBaselineType baseline) {
		event.getEiEvent().getEiEventSignals().setEiEventBaseline(baseline);
		return this;
	}

	public Oadr20bDistributeEventOadrEventBuilder withEiTarget(EiTargetType eiTargetType) {
		event.getEiEvent().setEiTarget(eiTargetType);
		return this;
	}

	public Oadr20bDistributeEventOadrEventBuilder withEventDescriptor(EventDescriptorType eventDescriptorType) {
		event.getEiEvent().setEventDescriptor(eventDescriptorType);
		return this;
	}

	public Oadr20bDistributeEventOadrEventBuilder withResponseRequired(boolean required) {
		ResponseRequiredType value = (required) ? ResponseRequiredType.ALWAYS : ResponseRequiredType.NEVER;
		event.setOadrResponseRequired(value);
		return this;
	}

	public OadrEvent build() {
		return event;
	}
}
