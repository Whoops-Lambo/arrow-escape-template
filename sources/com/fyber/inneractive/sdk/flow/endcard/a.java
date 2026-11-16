package com.fyber.inneractive.sdk.flow.endcard;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.fyber.inneractive.sdk.R;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a implements n {
    public final String a = IAlog.a(this);
    public final b b;

    public void c() {
    }

    public a(b bVar) {
        this.b = bVar;
    }

    public static ViewGroup a(View view) {
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(view.getContext()).inflate(R.layout.ia_endcard_container, (ViewGroup) null);
        viewGroup.addView(view);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = -1;
        view.setLayoutParams(layoutParams);
        return viewGroup;
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.n
    public void destroy() {
        a();
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.n
    public void a() {
        com.fyber.inneractive.sdk.util.v.a(b());
    }
}
