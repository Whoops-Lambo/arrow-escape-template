package com.bytedance.sdk.openadsdk.rz;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.bytedance.sdk.component.utils.ay;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.utils.gbb;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class uq extends TTDislikeDialogAbstract {
    private kgy uq;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface kgy {
        void ahm();

        void kgy();

        void kgy(int i, FilterWord filterWord);
    }

    public uq(Context context, String str, List<FilterWord> list) {
        super(context, ay.noq(context, "tt_dislikeDialog"));
        this.kgy = str;
        this.ahm = list;
    }

    private void ahm() {
        setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.bytedance.sdk.openadsdk.rz.uq.1
            @Override // android.content.DialogInterface.OnShowListener
            public void onShow(DialogInterface dialogInterface) {
                if (uq.this.uq != null) {
                    kgy unused = uq.this.uq;
                }
            }
        });
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.bytedance.sdk.openadsdk.rz.uq.2
            @Override // android.content.DialogInterface.OnDismissListener
            public void onDismiss(DialogInterface dialogInterface) {
                if (uq.this.uq != null) {
                    uq.this.uq.ahm();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract
    public View getLayoutView() {
        return new gf(getContext(), this.rz, this.ahm);
    }

    @Override // com.bytedance.sdk.openadsdk.rz.ra.ahm
    public void kgy(int i) {
        FilterWord filterWordAhm;
        if (ra.rz == i) {
            dismiss();
            return;
        }
        if (ra.ct == i) {
            kgy kgyVar = this.uq;
            if (kgyVar != null) {
                kgyVar.kgy();
                return;
            }
            return;
        }
        if (ra.ahm != i || (filterWordAhm = this.rz.ahm()) == null || ra.kgy.equals(filterWordAhm)) {
            return;
        }
        kgy kgyVar2 = this.uq;
        if (kgyVar2 != null) {
            try {
                kgyVar2.kgy(0, filterWordAhm);
            } catch (Throwable th) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4gYsyRS5Sg=", "b9oJnBCwYMyFbt5cgB6nDF7oLIAPqA==", "VOAEmxe5e8aDXt5LiQ==", 90);
            }
        }
        dismiss();
    }

    @Override // com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract
    public ViewGroup.LayoutParams getLayoutParams() {
        return new ViewGroup.LayoutParams(gbb.uq(getContext()) - 120, -2);
    }

    @Override // com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract, android.app.Dialog
    public void onCreate(Bundle bundle) {
        try {
            super.onCreate(bundle);
            setCanceledOnTouchOutside(true);
            setCancelable(true);
            kgy();
            ahm();
            setMaterialMeta(this.kgy, this.ahm);
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4gYsyRS5Sg=", "b9oJnBCwYMyFbt5cgB6nDF7oLIAPqA==", "VOAOhwa9fcI=", 47);
            dismiss();
        }
    }

    @Override // android.app.Dialog
    public void show() {
        try {
            super.show();
        } catch (WindowManager.BadTokenException e) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4gYsyRS5Sg=", "b9oJnBCwYMyFbt5cgB6nDF7oLIAPqA==", "SOYigg==", 101);
        }
    }

    public void kgy(kgy kgyVar) {
        this.uq = kgyVar;
    }

    private void kgy() {
        Window window = getWindow();
        if (window == null || window.getAttributes() == null) {
            return;
        }
        window.getAttributes().windowAnimations = 0;
    }
}
