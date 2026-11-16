package io.p071bidmachine.rendering.internal.adform.video.player.media;

import android.content.Context;
import android.media.MediaPlayer;
import android.view.MotionEvent;
import android.view.Surface;
import android.widget.FrameLayout;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.internal.partials.BidMachineVideoBridge;
import defpackage.az2;
import io.p071bidmachine.rendering.internal.view.a;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class h extends FrameLayout {
    public final a a;
    public i b;
    public MediaPlayer c;
    public Surface d;

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch("io.bidmachine", this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public final void setMediaPlayer(@Nullable MediaPlayer mediaPlayer) {
        a(null);
        this.c = mediaPlayer;
        if (mediaPlayer != null) {
            setVideoAspectRatio(mediaPlayer.getVideoWidth() / mediaPlayer.getVideoHeight());
            mediaPlayer.setOnVideoSizeChangedListener(new f(this));
        }
        a(this.d);
    }

    public final az2 a(Surface surface) {
        try {
            MediaPlayer mediaPlayer = this.c;
            if (mediaPlayer == null) {
                return null;
            }
            BidMachineVideoBridge.MediaPlayerSetSurface(mediaPlayer, surface);
            return az2.a;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Nullable
    public final i getListener() {
        return this.b;
    }

    public final void setListener(@Nullable i iVar) {
        this.b = iVar;
    }

    public final void setVideoAspectRatio(float f) {
        this.a.setVideoAspectRatio(f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Context context) {
        super(context);
        context.getClass();
        a aVar = new a(context);
        aVar.setSurfaceTextureListener(new g(this));
        this.a = aVar;
        addView(aVar, new FrameLayout.LayoutParams(-1, -1, 17));
    }
}
