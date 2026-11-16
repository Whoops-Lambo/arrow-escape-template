package defpackage;

import android.os.Parcelable;
import android.view.View;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.internal.ads.zzabi;
import com.google.android.gms.internal.ads.zzv;
import com.usercentrics.sdk.services.deviceStorage.models.ConsentsBufferEntry;
import com.usercentrics.sdk.services.tcf.interfaces.TCFPurpose;
import com.usercentrics.sdk.services.tcf.interfaces.TCFSpecialFeature;
import com.usercentrics.sdk.services.tcf.interfaces.TCFStack;
import java.io.File;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class zm implements Comparator {
    public static final /* synthetic */ zm b = new zm(17);
    public static final /* synthetic */ zm c = new zm(19);
    public static final /* synthetic */ zm d = new zm(20);
    public static final /* synthetic */ zm e = new zm(21);
    public static final /* synthetic */ zm f = new zm(22);
    public static final /* synthetic */ zm g = new zm(23);
    public static final /* synthetic */ zm h = new zm(24);
    public static final /* synthetic */ zm i = new zm(27);
    public static final /* synthetic */ zm j = new zm(28);
    public static final /* synthetic */ zm k = new zm(29);
    public final /* synthetic */ int a;

    public /* synthetic */ zm(int i2) {
        this.a = i2;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return uu.k(((ex1) obj).b, ((ex1) obj2).b);
            case 1:
                return uu.k(Long.valueOf(((ConsentsBufferEntry) obj).a), Long.valueOf(((ConsentsBufferEntry) obj2).a));
            case 2:
                return uu.k(((ex1) obj).b, ((ex1) obj2).b);
            case 3:
                return uu.k(Long.valueOf(((bx) obj).c), Long.valueOf(((bx) obj2).c));
            case 4:
                return ((ui2) obj).d - ((ui2) obj2).d;
            case 5:
                Charset charset = (Charset) obj;
                charset.getClass();
                String strName = charset.name();
                strName.getClass();
                Charset charset2 = (Charset) obj2;
                charset2.getClass();
                String strName2 = charset2.name();
                strName2.getClass();
                return uu.k(strName, strName2);
            case 6:
                return uu.k((Float) ((dt1) obj2).b, (Float) ((dt1) obj).b);
            case 7:
                return ((Comparable) obj).compareTo((Comparable) obj2);
            case 8:
                return uu.k(((ex1) obj).b, ((ex1) obj2).b);
            case 9:
                return uu.k(((ei) obj).a, ((ei) obj2).a);
            case 10:
                return uu.k(((ex1) obj).b, ((ex1) obj2).b);
            case 11:
                return uu.k(Integer.valueOf(Integer.parseInt((String) obj)), Integer.valueOf(Integer.parseInt((String) obj2)));
            case 12:
                return ((View) obj).getTop() - ((View) obj2).getTop();
            case 13:
                return uu.k(Integer.valueOf(((TCFPurpose) obj).c), Integer.valueOf(((TCFPurpose) obj2).c));
            case 14:
                return uu.k(Integer.valueOf(((TCFSpecialFeature) obj).c), Integer.valueOf(((TCFSpecialFeature) obj2).c));
            case 15:
                return uu.k(Integer.valueOf(((TCFStack) obj).b), Integer.valueOf(((TCFStack) obj2).b));
            case 16:
                long jLastModified = ((File) obj2).lastModified() - ((File) obj).lastModified();
                if (jLastModified == 0) {
                    return 0;
                }
                return jLastModified < 0 ? -1 : 1;
            case 17:
                Parcelable.Creator<GoogleSignInAccount> creator = GoogleSignInAccount.CREATOR;
                return ((Scope) obj).getScopeUri().compareTo(((Scope) obj2).getScopeUri());
            case 18:
                return ((Scope) obj).getScopeUri().compareTo(((Scope) obj2).getScopeUri());
            case 19:
                return Integer.compare(((zzv) obj2).j, ((zzv) obj).j);
            case 20:
                return ((tk3) Collections.max((List) obj)).compareTo((tk3) Collections.max((List) obj2));
            case 21:
                return Integer.compare(((dl3) ((List) obj).get(0)).f, ((dl3) ((List) obj2).get(0)).f);
            case 22:
                return ((hl3) ((List) obj).get(0)).compareTo((hl3) ((List) obj2).get(0));
            case 23:
                List list = (List) obj2;
                List list2 = (List) obj;
                return wq4.f(tl3.b((tl3) Collections.max(list2, sl3.c), (tl3) Collections.max(list, i))).b(list2.size(), list.size()).a((tl3) Collections.max(list2, j), (tl3) Collections.max(list, k), sl3.b).e();
            case 24:
                Integer num = (Integer) obj2;
                Integer num2 = (Integer) obj;
                vq4 vq4Var = zzabi.k;
                if (num2.intValue() == -1) {
                    return num.intValue() == -1 ? 0 : -1;
                }
                if (num.intValue() == -1) {
                    return 1;
                }
                return num2.intValue() - num.intValue();
            case 25:
                int iA = rl3.a(obj);
                int iA2 = rl3.a(obj2);
                if (iA != iA2) {
                    return h50.a(iA, iA2);
                }
                int iC = h50.C(iA);
                if (iC == 0) {
                    return ((Boolean) obj).compareTo((Boolean) obj2);
                }
                if (iC == 1) {
                    return ((String) obj).compareTo((String) obj2);
                }
                if (iC == 2) {
                    return ((Long) obj).compareTo((Long) obj2);
                }
                if (iC == 3) {
                    return ((Double) obj).compareTo((Double) obj2);
                }
                throw null;
            case 26:
                return ((String) ((Map.Entry) obj).getKey()).compareTo((String) ((Map.Entry) obj2).getKey());
            case 27:
                return tl3.b((tl3) obj, (tl3) obj2);
            case 28:
                return tl3.c((tl3) obj, (tl3) obj2);
            default:
                return tl3.c((tl3) obj, (tl3) obj2);
        }
    }
}
