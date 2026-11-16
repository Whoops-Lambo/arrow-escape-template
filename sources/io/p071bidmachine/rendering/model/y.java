package io.p071bidmachine.rendering.model;

import io.p071bidmachine.util.g;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public enum y implements g {
    OnImpression("on_impression"),
    OnBillableImpression("on_billable_impression"),
    OnClick("on_click"),
    OnClickResolved("on_click_resolved"),
    OnMute("on_mute"),
    OnUnMute("on_unmute"),
    OnPause("on_pause"),
    OnResume("on_resume"),
    OnSkip("on_skip"),
    OnClose("on_close"),
    OnStart("on_start"),
    OnFirstQuartile("on_first_quartile"),
    OnMidpoint("on_midpoint"),
    OnThirdQuartile("on_third_quartile"),
    OnComplete("on_complete"),
    OnProgress("on_progress"),
    OnUseCustomClose("on_use_custom_close"),
    OnScheduled("on_scheduled"),
    OnNavigate("on_navigate"),
    OnExpand("on_expand"),
    OnCollapse("on_collapse"),
    OnLayoutChanged("on_layout_changed");

    public final String a;

    @Override // io.p071bidmachine.util.g
    public final String getKey() {
        return this.a;
    }

    y(String str) {
        this.a = str;
    }
}
