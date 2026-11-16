package com.facebook.ads.redexgen.X;

import android.content.DialogInterface;

/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public class G0 extends AbstractRunnableC3416oq {
    public static String[] A02 = {"r", "tRYI", "7UJuVMqBcP2QEoAe5I9ReZPElv0qEy55", "leQvAr8Bdm", "IrxDcEzjLLQBxw", "x58zC904VQqUCNnuzCjkyAfM", "58DZzAqOGTGaE", "1xO3"};
    public final /* synthetic */ DialogInterface A00;
    public final /* synthetic */ DialogInterfaceOnClickListenerC3539qs A01;

    public G0(DialogInterfaceOnClickListenerC3539qs dialogInterfaceOnClickListenerC3539qs, DialogInterface dialogInterface) {
        this.A01 = dialogInterfaceOnClickListenerC3539qs;
        this.A00 = dialogInterface;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC3416oq
    public final void A07() {
        if (this.A01.A01.A02 != null) {
            this.A01.A01.A02.AIA(AbstractC3390oP.A03(this.A01.A01.A00), new C2571az().A05(this.A01.A01.A02(this.A01.A00.getText().toString())).A08());
        }
        DialogInterface dialogInterface = this.A00;
        if (A02[6].length() != 13) {
            throw new RuntimeException();
        }
        A02[6] = "1hADnGgCLejuT";
        dialogInterface.cancel();
    }
}
