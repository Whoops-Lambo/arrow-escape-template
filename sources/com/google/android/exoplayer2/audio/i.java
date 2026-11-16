package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.util.Util;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class i extends BaseAudioProcessor {
    public int a;
    public int b;
    public boolean c;
    public int d;
    public byte[] e;
    public int f;
    public long g;

    @Override // com.google.android.exoplayer2.audio.BaseAudioProcessor
    public final AudioProcessor.AudioFormat onConfigure(AudioProcessor.AudioFormat audioFormat) throws AudioProcessor.UnhandledAudioFormatException {
        if (audioFormat.encoding != 2) {
            throw new AudioProcessor.UnhandledAudioFormatException(audioFormat);
        }
        this.c = true;
        return (this.a == 0 && this.b == 0) ? AudioProcessor.AudioFormat.NOT_SET : audioFormat;
    }

    @Override // com.google.android.exoplayer2.audio.BaseAudioProcessor
    public final void onFlush() {
        if (this.c) {
            this.c = false;
            int i = this.b;
            int i2 = this.inputAudioFormat.bytesPerFrame;
            this.e = new byte[i * i2];
            this.d = this.a * i2;
        }
        this.f = 0;
    }

    @Override // com.google.android.exoplayer2.audio.BaseAudioProcessor
    public final void onQueueEndOfStream() {
        if (this.c) {
            int i = this.f;
            if (i > 0) {
                this.g += (long) (i / this.inputAudioFormat.bytesPerFrame);
            }
            this.f = 0;
        }
    }

    @Override // com.google.android.exoplayer2.audio.BaseAudioProcessor
    public final void onReset() {
        this.e = Util.EMPTY_BYTE_ARRAY;
    }

    @Override // com.google.android.exoplayer2.audio.BaseAudioProcessor, com.google.android.exoplayer2.audio.AudioProcessor
    public final ByteBuffer getOutput() {
        int i;
        if (super.isEnded() && (i = this.f) > 0) {
            replaceOutputBuffer(i).put(this.e, 0, this.f).flip();
            this.f = 0;
        }
        return super.getOutput();
    }

    @Override // com.google.android.exoplayer2.audio.BaseAudioProcessor, com.google.android.exoplayer2.audio.AudioProcessor
    public final boolean isEnded() {
        if (super.isEnded() && this.f == 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final void queueInput(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i = iLimit - iPosition;
        if (i != 0) {
            int iMin = Math.min(i, this.d);
            this.g += (long) (iMin / this.inputAudioFormat.bytesPerFrame);
            this.d -= iMin;
            byteBuffer.position(iPosition + iMin);
            if (this.d > 0) {
                return;
            }
            int i2 = i - iMin;
            int length = (this.f + i2) - this.e.length;
            ByteBuffer byteBufferReplaceOutputBuffer = replaceOutputBuffer(length);
            int iConstrainValue = Util.constrainValue(length, 0, this.f);
            byteBufferReplaceOutputBuffer.put(this.e, 0, iConstrainValue);
            int iConstrainValue2 = Util.constrainValue(length - iConstrainValue, 0, i2);
            byteBuffer.limit(byteBuffer.position() + iConstrainValue2);
            byteBufferReplaceOutputBuffer.put(byteBuffer);
            byteBuffer.limit(iLimit);
            int i3 = i2 - iConstrainValue2;
            int i4 = this.f - iConstrainValue;
            this.f = i4;
            byte[] bArr = this.e;
            System.arraycopy(bArr, iConstrainValue, bArr, 0, i4);
            byteBuffer.get(this.e, this.f, i3);
            this.f += i3;
            byteBufferReplaceOutputBuffer.flip();
        }
    }
}
