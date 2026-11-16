package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.ArrayList;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzfxv {
    public static final Pattern b = Pattern.compile("^[a-zA-Z0-9 ]+$");
    public final ArrayList a = new ArrayList();

    public final void a(View view, zzfwq zzfwqVar) {
        zzfxu zzfxuVar;
        if (view == null) {
            defpackage.d.r("FriendlyObstruction is null");
            return;
        }
        if (!b.matcher("Ad overlay").matches()) {
            defpackage.d.r("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
            return;
        }
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        do {
            if (i >= size) {
                zzfxuVar = null;
                break;
            } else {
                Object obj = arrayList.get(i);
                i++;
                zzfxuVar = (zzfxu) obj;
            }
        } while (zzfxuVar.a.get() != view);
        if (zzfxuVar == null) {
            arrayList.add(new zzfxu(view, zzfwqVar));
        }
    }
}
