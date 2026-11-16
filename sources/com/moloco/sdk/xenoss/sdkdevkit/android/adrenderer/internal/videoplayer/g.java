package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer;

import android.view.View;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.p;
import defpackage.dy;
import defpackage.vi2;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public interface g extends p {
    Object a(dy dyVar);

    void a(String str);

    void b(boolean z);

    View c();

    vi2 f();

    vi2 isPlaying();

    vi2 p();

    void pause();

    void play();

    void seekTo(long j);
}
