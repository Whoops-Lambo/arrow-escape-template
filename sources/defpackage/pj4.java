package defpackage;

import com.google.android.gms.internal.games_v2.zzfv;
import com.google.android.gms.internal.games_v2.zzgz;
import com.google.android.gms.internal.games_v2.zzhh;
import com.google.android.gms.internal.games_v2.zzhj;
import com.google.android.gms.internal.games_v2.zzhs;
import com.google.android.gms.internal.games_v2.zzhw;
import java.util.ArrayList;
import java.util.function.BinaryOperator;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class pj4 implements BinaryOperator {
    public static final /* synthetic */ pj4 b = new pj4(0);
    public static final /* synthetic */ pj4 c = new pj4(1);
    public static final /* synthetic */ pj4 d = new pj4(2);
    public final /* synthetic */ int a;

    public /* synthetic */ pj4(int i) {
        this.a = i;
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        int i = 0;
        switch (this.a) {
            case 0:
                zzgz zzgzVar = (zzgz) obj2;
                zzgz zzgzVar2 = (zzgz) obj;
                Object[] objArr = zzgzVar.a;
                int i2 = zzgzVar.b;
                for (int i3 = 0; i3 < i2; i3++) {
                    zzgzVar2.getClass();
                    zzhs.a(i3, objArr[i3]);
                }
                zzgzVar2.c(i2);
                System.arraycopy(objArr, 0, zzgzVar2.a, zzgzVar2.b, i2);
                zzgzVar2.b += i2;
                return zzgzVar2;
            case 1:
                zzhh zzhhVar = (zzhh) obj;
                zzhhVar.getClass();
                ArrayList arrayList = ((zzhh) obj2).a;
                int size = arrayList.size();
                while (i < size) {
                    Object obj3 = arrayList.get(i);
                    i++;
                    zzhw zzhwVar = (zzhw) obj3;
                    if (zzhwVar.a.equals(zzhwVar.b)) {
                        d.r(zzfv.a("range must not be empty, but was %s", zzhwVar));
                        return null;
                    }
                    zzhhVar.a.add(zzhwVar);
                }
                return zzhhVar;
            default:
                zzhj zzhjVar = (zzhj) obj2;
                zzhj zzhjVar2 = (zzhj) obj;
                Object[] objArr2 = zzhjVar.a;
                int i4 = zzhjVar.b;
                for (int i5 = 0; i5 < i4; i5++) {
                    zzhjVar2.getClass();
                    zzhs.a(i5, objArr2[i5]);
                }
                zzhjVar2.c(i4);
                System.arraycopy(objArr2, 0, zzhjVar2.a, zzhjVar2.b, i4);
                zzhjVar2.b += i4;
                return zzhjVar2;
        }
    }
}
