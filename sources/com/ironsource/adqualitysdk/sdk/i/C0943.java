package com.ironsource.adqualitysdk.sdk.i;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ᘆ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C0943 extends AbstractRunnableC1096 {

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C0920 f2540;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ ArrayList f2541;

    public C0943(C0920 c0920, ArrayList arrayList) {
        this.f2540 = c0920;
        this.f2541 = arrayList;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC1096
    /* JADX INFO: renamed from: ﾒ */
    public final void mo344() {
        Object obj;
        ArrayList arrayListM421 = AbstractC4634o0.m421(this.f2540.f2429.f2371, this.f2541);
        ArrayList arrayList = this.f2541;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            View view = (View) obj2;
            ArrayList arrayList2 = this.f2540.f2429.f2371;
            int size2 = arrayList2.size();
            int i2 = 0;
            do {
                if (i2 >= size2) {
                    this.f2540.f2429.f2371.add(new WeakReference(view));
                    AbstractC4631n.m401(new C0988(this, view));
                    break;
                } else {
                    obj = arrayList2.get(i2);
                    i2++;
                }
            } while (((WeakReference) obj).get() != view);
        }
        for (int i3 = 0; i3 < arrayListM421.size(); i3++) {
            AbstractC4631n.m401(new C0960(this, (View) arrayListM421.get(i3)));
        }
    }
}
