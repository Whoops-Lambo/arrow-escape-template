package com.ironsource.adqualitysdk.sdk.i;

import android.view.View;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ᵂ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class C0997 extends WeakHashMap implements InterfaceC0672 {

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C0971 f2838;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final C0752 f2839;

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0672
    /* JADX INFO: renamed from: ﾒ */
    public final Object mo359() {
        return this;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0997(C0971 c0971, WeakHashMap weakHashMap, C0752 c0752) {
        super(weakHashMap);
        this.f2838 = c0971;
        this.f2839 = c0752;
    }

    @Override // java.util.WeakHashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        View view = (View) obj;
        WeakReference weakReference = (WeakReference) obj2;
        this.f2838.m519(this, this.f2839, StringFog.decrypt("iRUP5mGvaHCQERrkX6tafIoVC6Fnv10=\n", "x3R7jxfKKRQ=\n"), view, weakReference);
        return (WeakReference) super.put(view, weakReference);
    }
}
