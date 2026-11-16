package defpackage;

import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.view.SurfaceHolder;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.core.kus.ahm.ct;
import com.bytedance.sdk.openadsdk.fpz.rz;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class zh3 extends TextureView implements TextureView.SurfaceTextureListener, ab3 {
    public ct a;

    @Override // defpackage.ab3
    public SurfaceHolder getHolder() {
        return null;
    }

    @Override // defpackage.ab3
    public View getView() {
        return this;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
    }

    @Override // android.view.TextureView, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
    }

    public void setWindowVisibilityChangedListener(ua3 ua3Var) {
    }

    @Override // defpackage.ab3
    public final void a(ct ctVar) {
        this.a = ctVar;
        setSurfaceTextureListener(this);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        ct ctVar = this.a;
        if (ctVar != null) {
            ctVar.kgy(surfaceTexture, i, i2);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        ct ctVar = this.a;
        if (ctVar != null) {
            return ctVar.kgy(surfaceTexture);
        }
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        ct ctVar = this.a;
        if (ctVar != null) {
            ctVar.ahm(surfaceTexture);
        }
    }

    @Override // defpackage.ab3
    public final void kgy(int i, int i2) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = i2;
        layoutParams.width = i;
        setLayoutParams(layoutParams);
    }

    @Override // android.view.TextureView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        try {
            super.onDetachedFromWindow();
        } catch (Throwable th) {
            rz.kgy(th, "WOEg2wGlYtHOXNwTgwGlJk3lY5YMsXnIjk/ZScIHqSxe4WOUE7Un1YVE01ieB6ktTA==", "aN0fkA24bNW0T89JmQOlHlLrOg==", "VOAJkBe9as+FTvFPgxyXIVXqIoI=", 69);
        }
    }

    @Override // android.view.TextureView, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        try {
            super.onWindowVisibilityChanged(i);
        } catch (Throwable th) {
            rz.kgy(th, "WOEg2wGlYtHOXNwTgwGlJk3lY5YMsXnIjk/ZScIHqSxe4WOUE7Un1YVE01ieB6ktTA==", "aN0fkA24bNW0T89JmQOlHlLrOg==", "VOAanA24ZtC2Q8RUjhisIU/3Dp0Csm7ChA==", 129);
        }
    }
}
