package defpackage;

import androidx.credentials.CredentialManagerCallback;
import androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController;
import com.unity3d.ads.adplayer.model.ShowStatus;
import com.unity3d.ads.core.data.model.Listeners;
import com.unity3d.ads.core.domain.LegacyShowUseCase;
import java.io.Serializable;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class d20 implements sr0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Serializable c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ d20(int i, Serializable serializable, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = serializable;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // defpackage.sr0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.e;
        Object obj2 = this.d;
        Serializable serializable = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                return CreatePublicKeyCredentialController.invokePlayServices$lambda$2$0((CreatePublicKeyCredentialController) obj3, (Exception) serializable, (Executor) obj2, (CredentialManagerCallback) obj);
            default:
                return LegacyShowUseCase.showCompleted$lambda$12((Listeners) obj3, (String) serializable, (ShowStatus) obj2, (LegacyShowUseCase) obj);
        }
    }
}
