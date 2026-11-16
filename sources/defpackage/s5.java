package defpackage;

import androidx.credentials.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController;
import androidx.credentials.playservices.controllers.identityauth.createpassword.CredentialProviderCreatePasswordController;
import androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController;
import androidx.credentials.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController;
import androidx.credentials.playservices.controllers.identitycredentials.createdigitalcredential.CreateDigitalCredentialController;
import com.inmobi.media.C0;
import com.inmobi.media.C4371s3;
import com.inmobi.media.Ee;
import com.inmobi.media.Fa;
import com.inmobi.media.H1;
import com.inmobi.media.Id;
import com.inmobi.media.J3;
import com.inmobi.media.N0;
import com.inmobi.media.Ol;
import com.ironsource.Ec;
import com.ironsource.I2;
import com.ironsource.Pb;
import com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer;
import com.unity3d.ads.core.data.datasource.AndroidAdQualityVersionDataSource;
import com.unity3d.ads.core.data.datasource.AndroidGoogleAppIdDataSource;
import com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository;
import com.unity3d.ads.core.data.repository.AndroidMediationRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.AndroidGetInitModuleListeners;
import com.unity3d.ads.core.domain.AndroidGetIsAdActivity;
import com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken;
import com.unity3d.ads.core.domain.adquality.AndroidInitializeAdQuality;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class s5 implements sr0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ s5(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.sr0
    public final Object invoke() throws InterruptedException {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return AndroidAdQualityVersionDataSource.cachedVersion_delegate$lambda$4$lambda$1((NoClassDefFoundError) obj);
            case 1:
                return AndroidAdQualityVersionDataSource.cachedVersion_delegate$lambda$4$lambda$2((ClassNotFoundException) obj);
            case 2:
                return AndroidAdQualityVersionDataSource.cachedVersion_delegate$lambda$4$lambda$3((NoSuchMethodError) obj);
            case 3:
                return AndroidAdQualityVersionDataSource.cachedVersion_delegate$lambda$4((AndroidAdQualityVersionDataSource) obj);
            case 4:
                return AndroidDiagnosticEventRepository.configure$lambda$9((AndroidDiagnosticEventRepository) obj);
            case 5:
                return AndroidFullscreenWebViewAdPlayer.adObject_delegate$lambda$1((AndroidFullscreenWebViewAdPlayer) obj);
            case 6:
                return ((AndroidGetInitModuleListeners) obj).discover();
            case 7:
                return AndroidGetIsAdActivity.activities_delegate$lambda$1((AndroidGetIsAdActivity) obj);
            case 8:
                return AndroidGoogleAppIdDataSource.googleAppId_delegate$lambda$3((AndroidGoogleAppIdDataSource) obj);
            case 9:
                return AndroidInitializeAdQuality.reportLoadFailure$lambda$3((Throwable) obj);
            case 10:
                return AndroidMediationRepository._get_mediationProvider_$lambda$0((AndroidMediationRepository) obj);
            case 11:
                return rd1.m((Object[]) obj);
            case 12:
                return C0.b((C0) obj);
            case 13:
                return CommonInitAwaitingGetHeaderBiddingToken.tokenFailure$lambda$4((CommonInitAwaitingGetHeaderBiddingToken) obj);
            case 14:
                return Integer.valueOf(((SessionRepository) obj).getHeaderBiddingTokenCounter());
            case 15:
                return CreateDigitalCredentialController.handleResponse$lambda$2((CreateDigitalCredentialController) obj);
            case 16:
                return CredentialProviderBeginSignInController.invokePlayServices$lambda$0$0((CredentialProviderBeginSignInController) obj);
            case 17:
                return CredentialProviderCreatePasswordController.invokePlayServices$lambda$0$0((CredentialProviderCreatePasswordController) obj);
            case 18:
                return CredentialProviderCreatePublicKeyCredentialController.invokePlayServices$lambda$2$0((CredentialProviderCreatePublicKeyCredentialController) obj);
            case 19:
                return CredentialProviderGetSignInIntentController.invokePlayServices$lambda$1$0((CredentialProviderGetSignInIntentController) obj);
            case 20:
                return Ec.a((Ec) obj);
            case 21:
                return Ee.a((Ee) obj);
            case 22:
                ((bo0) obj).a.await();
                return az2.a;
            case 23:
                return H1.a((H1) obj);
            case 24:
                return I2.b((I2) obj);
            case 25:
                return Id.a((Id) obj);
            case 26:
                return J3.b((C4371s3) obj);
            case 27:
                return Boolean.valueOf(N0.a((N0) obj));
            case 28:
                return Ol.a((Fa) obj);
            default:
                return Pb.a((Pb) obj);
        }
    }
}
