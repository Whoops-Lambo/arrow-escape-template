package io.p071bidmachine.util.download;

import android.content.Context;
import defpackage.as0;
import defpackage.rc1;
import io.p071bidmachine.util.log.b;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class d extends rc1 implements as0 {
    public static final d i = new d(3);

    @Override // defpackage.as0
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Context context = (Context) obj;
        File file = (File) obj2;
        b bVar = (b) obj3;
        context.getClass();
        file.getClass();
        bVar.getClass();
        return new j(context, file, bVar);
    }
}
