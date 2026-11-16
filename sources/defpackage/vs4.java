package defpackage;

import com.google.android.gms.internal.ads.x;
import com.google.android.gms.internal.ads.zzgzl;
import com.google.android.gms.internal.ads.zzhbx;
import com.google.android.gms.internal.ads.zzhcb;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class vs4 extends zzhbx {
    public final File a;
    public final zzgzl b;

    public final String toString() {
        String string = this.a.toString();
        int length = string.length();
        String strValueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(length + 19 + strValueOf.length() + 1);
        q63.y(sb, "Files.asByteSink(", string, ", ", strValueOf);
        sb.append(")");
        return sb.toString();
    }

    public vs4(File file, zzhcb[] zzhcbVarArr) {
        zzgzl gr4Var;
        file.getClass();
        this.a = file;
        int i = zzgzl.c;
        int length = zzhcbVarArr.length;
        if (length != 0) {
            if (length != 1) {
                gr4Var = zzgzl.B(length, (Object[]) zzhcbVarArr.clone());
            } else {
                gr4Var = new gr4(zzhcbVarArr[0]);
            }
        } else {
            gr4Var = x.j;
        }
        this.b = gr4Var;
    }
}
