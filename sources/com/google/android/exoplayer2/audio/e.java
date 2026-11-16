package com.google.android.exoplayer2.audio;

import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;
import defpackage.a80;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class e extends AudioTrack$StreamEventCallback {
    public final /* synthetic */ a80 a;

    public e(a80 a80Var) {
        this.a = a80Var;
    }

    public final void onDataRequest(AudioTrack audioTrack, int i) {
        a80 a80Var = this.a;
        if (audioTrack.equals(a80Var.c.audioTrack) && a80Var.c.listener != null && a80Var.c.playing) {
            a80Var.c.listener.onOffloadBufferEmptying();
        }
    }

    public final void onTearDown(AudioTrack audioTrack) {
        a80 a80Var = this.a;
        if (audioTrack.equals(a80Var.c.audioTrack) && a80Var.c.listener != null && a80Var.c.playing) {
            a80Var.c.listener.onOffloadBufferEmptying();
        }
    }
}
