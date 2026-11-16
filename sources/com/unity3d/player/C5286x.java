package com.unity3d.player;

import android.view.KeyEvent;
import android.widget.TextView;

/* JADX INFO: renamed from: com.unity3d.player.x, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class C5286x implements TextView.OnEditorActionListener {
    public final /* synthetic */ AbstractC5288y a;

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i == 6) {
            AbstractC5288y abstractC5288y = this.a;
            abstractC5288y.a(abstractC5288y.b(), false);
        }
        return false;
    }

    public C5286x(AbstractC5288y abstractC5288y) {
        this.a = abstractC5288y;
    }
}
