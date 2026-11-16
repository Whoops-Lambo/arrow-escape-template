package com.google.android.exoplayer2.audio;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import defpackage.gh2;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class SonicAudioProcessor implements AudioProcessor {
    private static final float CLOSE_THRESHOLD = 1.0E-4f;
    private static final int MIN_BYTES_FOR_DURATION_SCALING_CALCULATION = 1024;
    public static final int SAMPLE_RATE_NO_CHANGE = -1;
    private ByteBuffer buffer;
    private AudioProcessor.AudioFormat inputAudioFormat;
    private long inputBytes;
    private boolean inputEnded;
    private AudioProcessor.AudioFormat outputAudioFormat;
    private ByteBuffer outputBuffer;
    private long outputBytes;
    private AudioProcessor.AudioFormat pendingInputAudioFormat;
    private AudioProcessor.AudioFormat pendingOutputAudioFormat;
    private int pendingOutputSampleRate;
    private boolean pendingSonicRecreation;
    private ShortBuffer shortBuffer;

    @Nullable
    private gh2 sonic;
    private float speed = 1.0f;
    private float pitch = 1.0f;

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public AudioProcessor.AudioFormat configure(AudioProcessor.AudioFormat audioFormat) throws AudioProcessor.UnhandledAudioFormatException {
        if (audioFormat.encoding != 2) {
            throw new AudioProcessor.UnhandledAudioFormatException(audioFormat);
        }
        int i = this.pendingOutputSampleRate;
        if (i == -1) {
            i = audioFormat.sampleRate;
        }
        this.pendingInputAudioFormat = audioFormat;
        AudioProcessor.AudioFormat audioFormat2 = new AudioProcessor.AudioFormat(i, audioFormat.channelCount, 2);
        this.pendingOutputAudioFormat = audioFormat2;
        this.pendingSonicRecreation = true;
        return audioFormat2;
    }

    public long getMediaDuration(long j) {
        if (this.outputBytes < 1024) {
            return (long) (((double) this.speed) * j);
        }
        long j2 = this.inputBytes;
        gh2 gh2Var = (gh2) Assertions.checkNotNull(this.sonic);
        long j3 = j2 - ((long) ((gh2Var.k * gh2Var.b) * 2));
        int i = this.outputAudioFormat.sampleRate;
        int i2 = this.inputAudioFormat.sampleRate;
        long j4 = this.outputBytes;
        return i == i2 ? Util.scaleLargeTimestamp(j, j3, j4) : Util.scaleLargeTimestamp(j, j3 * ((long) i), j4 * ((long) i2));
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public ByteBuffer getOutput() {
        gh2 gh2Var = this.sonic;
        if (gh2Var != null) {
            int i = gh2Var.b;
            int i2 = gh2Var.m * i * 2;
            if (i2 > 0) {
                if (this.buffer.capacity() < i2) {
                    ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(i2).order(ByteOrder.nativeOrder());
                    this.buffer = byteBufferOrder;
                    this.shortBuffer = byteBufferOrder.asShortBuffer();
                } else {
                    this.buffer.clear();
                    this.shortBuffer.clear();
                }
                ShortBuffer shortBuffer = this.shortBuffer;
                int iMin = Math.min(shortBuffer.remaining() / i, gh2Var.m);
                int i3 = iMin * i;
                shortBuffer.put(gh2Var.l, 0, i3);
                int i4 = gh2Var.m - iMin;
                gh2Var.m = i4;
                short[] sArr = gh2Var.l;
                System.arraycopy(sArr, i3, sArr, 0, i4 * i);
                this.outputBytes += (long) i2;
                this.buffer.limit(i2);
                this.outputBuffer = this.buffer;
            }
        }
        ByteBuffer byteBuffer = this.outputBuffer;
        this.outputBuffer = AudioProcessor.EMPTY_BUFFER;
        return byteBuffer;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public boolean isActive() {
        if (this.pendingOutputAudioFormat.sampleRate != -1) {
            return Math.abs(this.speed - 1.0f) >= CLOSE_THRESHOLD || Math.abs(this.pitch - 1.0f) >= CLOSE_THRESHOLD || this.pendingOutputAudioFormat.sampleRate != this.pendingInputAudioFormat.sampleRate;
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public boolean isEnded() {
        if (!this.inputEnded) {
            return false;
        }
        gh2 gh2Var = this.sonic;
        return gh2Var == null || (gh2Var.m * gh2Var.b) * 2 == 0;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public void queueEndOfStream() {
        gh2 gh2Var = this.sonic;
        if (gh2Var != null) {
            int i = gh2Var.k;
            float f = gh2Var.c;
            float f2 = gh2Var.d;
            int i2 = gh2Var.m + ((int) ((((i / (f / f2)) + gh2Var.o) / (gh2Var.e * f2)) + 0.5f));
            short[] sArr = gh2Var.j;
            int i3 = gh2Var.h * 2;
            gh2Var.j = gh2Var.c(sArr, i, i3 + i);
            int i4 = 0;
            while (true) {
                int i5 = gh2Var.b;
                if (i4 >= i3 * i5) {
                    break;
                }
                gh2Var.j[(i5 * i) + i4] = 0;
                i4++;
            }
            gh2Var.k = i3 + gh2Var.k;
            gh2Var.f();
            if (gh2Var.m > i2) {
                gh2Var.m = i2;
            }
            gh2Var.k = 0;
            gh2Var.r = 0;
            gh2Var.o = 0;
        }
        this.inputEnded = true;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public void reset() {
        this.speed = 1.0f;
        this.pitch = 1.0f;
        AudioProcessor.AudioFormat audioFormat = AudioProcessor.AudioFormat.NOT_SET;
        this.pendingInputAudioFormat = audioFormat;
        this.pendingOutputAudioFormat = audioFormat;
        this.inputAudioFormat = audioFormat;
        this.outputAudioFormat = audioFormat;
        ByteBuffer byteBuffer = AudioProcessor.EMPTY_BUFFER;
        this.buffer = byteBuffer;
        this.shortBuffer = byteBuffer.asShortBuffer();
        this.outputBuffer = byteBuffer;
        this.pendingOutputSampleRate = -1;
        this.pendingSonicRecreation = false;
        this.sonic = null;
        this.inputBytes = 0L;
        this.outputBytes = 0L;
        this.inputEnded = false;
    }

    public void setOutputSampleRateHz(int i) {
        this.pendingOutputSampleRate = i;
    }

    public void setPitch(float f) {
        if (this.pitch != f) {
            this.pitch = f;
            this.pendingSonicRecreation = true;
        }
    }

    public void setSpeed(float f) {
        if (this.speed != f) {
            this.speed = f;
            this.pendingSonicRecreation = true;
        }
    }

    public SonicAudioProcessor() {
        AudioProcessor.AudioFormat audioFormat = AudioProcessor.AudioFormat.NOT_SET;
        this.pendingInputAudioFormat = audioFormat;
        this.pendingOutputAudioFormat = audioFormat;
        this.inputAudioFormat = audioFormat;
        this.outputAudioFormat = audioFormat;
        ByteBuffer byteBuffer = AudioProcessor.EMPTY_BUFFER;
        this.buffer = byteBuffer;
        this.shortBuffer = byteBuffer.asShortBuffer();
        this.outputBuffer = byteBuffer;
        this.pendingOutputSampleRate = -1;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public void flush() {
        if (isActive()) {
            AudioProcessor.AudioFormat audioFormat = this.pendingInputAudioFormat;
            this.inputAudioFormat = audioFormat;
            AudioProcessor.AudioFormat audioFormat2 = this.pendingOutputAudioFormat;
            this.outputAudioFormat = audioFormat2;
            if (this.pendingSonicRecreation) {
                this.sonic = new gh2(audioFormat.sampleRate, audioFormat.channelCount, this.speed, this.pitch, audioFormat2.sampleRate);
            } else {
                gh2 gh2Var = this.sonic;
                if (gh2Var != null) {
                    gh2Var.k = 0;
                    gh2Var.m = 0;
                    gh2Var.o = 0;
                    gh2Var.p = 0;
                    gh2Var.q = 0;
                    gh2Var.r = 0;
                    gh2Var.s = 0;
                    gh2Var.t = 0;
                    gh2Var.u = 0;
                    gh2Var.v = 0;
                }
            }
        }
        this.outputBuffer = AudioProcessor.EMPTY_BUFFER;
        this.inputBytes = 0L;
        this.outputBytes = 0L;
        this.inputEnded = false;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public void queueInput(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            return;
        }
        gh2 gh2Var = (gh2) Assertions.checkNotNull(this.sonic);
        ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
        int iRemaining = byteBuffer.remaining();
        this.inputBytes += (long) iRemaining;
        gh2Var.getClass();
        int iRemaining2 = shortBufferAsShortBuffer.remaining();
        int i = gh2Var.b;
        int i2 = iRemaining2 / i;
        short[] sArrC = gh2Var.c(gh2Var.j, gh2Var.k, i2);
        gh2Var.j = sArrC;
        shortBufferAsShortBuffer.get(sArrC, gh2Var.k * i, ((i2 * i) * 2) / 2);
        gh2Var.k += i2;
        gh2Var.f();
        byteBuffer.position(byteBuffer.position() + iRemaining);
    }
}
