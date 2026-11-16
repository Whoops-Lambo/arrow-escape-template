package defpackage;

import android.app.ApplicationExitInfo;
import com.inmobi.media.AbstractC4060gq;
import com.inmobi.media.AbstractC4496wi;
import com.inmobi.media.AbstractC4523xi;
import com.inmobi.media.C3907bc;
import com.inmobi.media.C4020fe;
import com.inmobi.media.C4101ib;
import com.inmobi.media.C4170kp;
import com.inmobi.media.C4398t2;
import com.inmobi.media.C4484w6;
import com.inmobi.media.V2;
import com.ironsource.C4690cc;
import com.ironsource.C4863m6;
import com.ironsource.C5031vd;
import com.unity3d.ads.adplayer.WebViewAdPlayer;
import com.unity3d.ads.core.data.datasource.UniversalRequestDataStoreProvider;
import com.unity3d.services.ads.offerwall.OfferwallEvent;
import java.util.UUID;
import kotlin.reflect.KClass;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class sv1 implements sr0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ sv1(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.sr0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                tv1 tv1Var = (tv1) obj;
                w92 w92VarD = wx.d("kotlinx.serialization.Polymorphic", rv1.d, new SerialDescriptor[0], new ej1(tv1Var, 3));
                KClass kClass = tv1Var.a;
                kClass.getClass();
                return new vx(w92VarD, kClass);
            case 1:
                ((n43) obj).getClass();
                UUID uuidRandomUUID = UUID.randomUUID();
                uuidRandomUUID.getClass();
                String string = uuidRandomUUID.toString();
                string.getClass();
                return string;
            case 2:
                return obj;
            case 3:
                w92 w92Var = (w92) obj;
                return Integer.valueOf(l41.k(w92Var, w92Var.k));
            case 4:
                return UniversalRequestDataStoreProvider.createDataStore$lambda$3((UniversalRequestDataStoreProvider) obj);
            case 5:
                return V2.a((V2) obj);
            case 6:
                return WebViewAdPlayer.sendOfferwallEvent$lambda$15((OfferwallEvent) obj);
            case 7:
                return C3907bc.a((C3907bc) obj);
            case 8:
                return C4690cc.a((C4690cc) obj);
            case 9:
                return C4020fe.a((C4020fe) obj);
            case 10:
                return AbstractC4060gq.a((AbstractC4060gq) obj);
            case 11:
                return C4101ib.d((C4101ib) obj);
            case 12:
                return C4170kp.a((C4170kp) obj);
            case 13:
                return C4863m6.a((C4863m6) obj);
            case 14:
                return C4398t2.e((C4398t2) obj);
            case 15:
                return C5031vd.c((ApplicationExitInfo) obj);
            case 16:
                return C4484w6.a((C4484w6) obj);
            default:
                return AbstractC4523xi.b((AbstractC4496wi) obj);
        }
    }
}
