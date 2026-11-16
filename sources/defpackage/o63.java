package defpackage;

import com.google.android.exoplayer2.extractor.VorbisUtil;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class o63 {
    public final VorbisUtil.VorbisIdHeader a;
    public final VorbisUtil.CommentHeader b;
    public final byte[] c;
    public final VorbisUtil.Mode[] d;
    public final int e;

    public o63(VorbisUtil.VorbisIdHeader vorbisIdHeader, VorbisUtil.CommentHeader commentHeader, byte[] bArr, VorbisUtil.Mode[] modeArr, int i) {
        this.a = vorbisIdHeader;
        this.b = commentHeader;
        this.c = bArr;
        this.d = modeArr;
        this.e = i;
    }
}
