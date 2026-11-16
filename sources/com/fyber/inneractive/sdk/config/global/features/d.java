package com.fyber.inneractive.sdk.config.global.features;

import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class d extends i {
    public com.fyber.inneractive.sdk.model.vast.a e;

    public d() {
        super("cta_locale");
    }

    @Override // com.fyber.inneractive.sdk.config.global.features.i
    public final i b() {
        d dVar = new d();
        a(dVar);
        return dVar;
    }

    public final void d(String str) {
        if (!TextUtils.isEmpty(str) && this.e == null) {
            this.e = new com.fyber.inneractive.sdk.model.vast.a(a("install_" + str, null), a("skip_ad_" + str, null), a("skip_in_" + str, null));
        }
    }
}
