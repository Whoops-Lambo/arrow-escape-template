package defpackage;

import androidx.credentials.playservices.controllers.CredentialProviderController;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class m20 implements sr0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ wr0 b;
    public final /* synthetic */ m32 c;

    public /* synthetic */ m20(wr0 wr0Var, m32 m32Var, int i) {
        this.a = i;
        this.b = wr0Var;
        this.c = m32Var;
    }

    @Override // defpackage.sr0
    public final Object invoke() {
        int i = this.a;
        m32 m32Var = this.c;
        wr0 wr0Var = this.b;
        switch (i) {
            case 0:
                return CredentialProviderController.Companion.maybeReportErrorResultCodeCreate$lambda$0(wr0Var, m32Var);
            default:
                return CredentialProviderController.Companion.maybeReportErrorResultCodeGet$lambda$0(wr0Var, m32Var);
        }
    }
}
