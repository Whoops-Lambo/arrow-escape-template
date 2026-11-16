package defpackage;

import android.media.AudioTimestamp;
import android.media.AudioTrack;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class db {
    public final Object a;
    public final Object b;
    public long c;
    public long d;
    public long e;

    public db(AudioTrack audioTrack, int i) {
        switch (i) {
            case 1:
                this.a = audioTrack;
                this.b = new AudioTimestamp();
                break;
            default:
                this.a = audioTrack;
                this.b = new AudioTimestamp();
                break;
        }
    }

    public /* synthetic */ db(ByteBuffer byteBuffer, long j, long j2, long j3, ByteBuffer byteBuffer2) {
        this.a = byteBuffer;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.b = byteBuffer2;
    }
}
