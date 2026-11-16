package com.bytedance.sdk.openadsdk;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.rz.ra;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class TTDislikeDialogAbstract extends Dialog implements ra.ahm {
    protected List<FilterWord> ahm;
    protected String kgy;
    protected final ra rz;
    private View uq;

    public abstract ViewGroup.LayoutParams getLayoutParams();

    public abstract View getLayoutView();

    public void destroy() {
        ra raVar = this.rz;
        if (raVar != null) {
            raVar.kgy();
        }
    }

    public ra getDislikeManager() {
        return this.rz;
    }

    public void onSuggestionSubmit(String str) {
        ra raVar = this.rz;
        if (raVar != null) {
            raVar.rz(str);
        }
    }

    public void setMaterialMeta(String str, List<FilterWord> list) {
        this.kgy = str;
        this.ahm = list;
        this.rz.kgy(str);
        this.rz.kgy(this.ahm);
    }

    public TTDislikeDialogAbstract(@NonNull Context context) {
        super(context);
        ra raVar = new ra();
        this.rz = raVar;
        raVar.kgy(this);
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.uq = getLayoutView();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        View view = this.uq;
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, -1);
        }
        setContentView(view, layoutParams);
    }

    public TTDislikeDialogAbstract(@NonNull Context context, int i) {
        super(context, i);
        ra raVar = new ra();
        this.rz = raVar;
        raVar.kgy(this);
    }
}
