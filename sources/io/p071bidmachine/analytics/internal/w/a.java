package io.p071bidmachine.analytics.internal.w;

import defpackage.dy;
import io.p071bidmachine.analytics.ReaderConfig;
import java.io.File;
import java.io.FileNotFoundException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class a extends io.p071bidmachine.analytics.internal.r.a {
    public abstract File a(ReaderConfig.Rule rule);

    public static /* synthetic */ Object a(a aVar, ReaderConfig.Rule rule, dy dyVar) throws FileNotFoundException {
        File fileA = aVar.a(rule);
        if (fileA.exists()) {
            StringBuilder sb = new StringBuilder();
            sb.append(fileA.lastModified());
            sb.append('_');
            sb.append(fileA.length());
            return sb.toString();
        }
        throw new FileNotFoundException();
    }

    @Override // io.p071bidmachine.analytics.internal.r.a
    public Object a(ReaderConfig.Rule rule, dy dyVar) {
        return a(this, rule, dyVar);
    }
}
