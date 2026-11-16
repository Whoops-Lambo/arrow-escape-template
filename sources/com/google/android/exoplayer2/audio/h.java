package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.util.Util;
import com.inmobi.media.core.config.models.AdConfig;
import io.p071bidmachine.media3.extractor.ts.y;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class h extends BaseAudioProcessor {
    @Override // com.google.android.exoplayer2.audio.BaseAudioProcessor
    public final AudioProcessor.AudioFormat onConfigure(AudioProcessor.AudioFormat audioFormat) throws AudioProcessor.UnhandledAudioFormatException {
        int i = audioFormat.encoding;
        if (i == 3 || i == 2 || i == 268435456 || i == 536870912 || i == 805306368 || i == 4) {
            return i != 2 ? new AudioProcessor.AudioFormat(audioFormat.sampleRate, audioFormat.channelCount, 2) : AudioProcessor.AudioFormat.NOT_SET;
        }
        throw new AudioProcessor.UnhandledAudioFormatException(audioFormat);
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final void queueInput(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i = iLimit - iPosition;
        int i2 = this.inputAudioFormat.encoding;
        if (i2 != 3) {
            if (i2 != 4) {
                if (i2 != 268435456) {
                    if (i2 != 536870912) {
                        if (i2 != 805306368) {
                            y.b();
                            return;
                        }
                        i /= 2;
                    } else {
                        i /= 3;
                        i *= 2;
                    }
                }
            } else {
                i /= 2;
            }
        } else {
            i *= 2;
        }
        ByteBuffer byteBufferReplaceOutputBuffer = replaceOutputBuffer(i);
        int i3 = this.inputAudioFormat.encoding;
        if (i3 != 3) {
            if (i3 != 4) {
                if (i3 != 268435456) {
                    if (i3 != 536870912) {
                        if (i3 == 805306368) {
                            while (iPosition < iLimit) {
                                byteBufferReplaceOutputBuffer.put(byteBuffer.get(iPosition + 2));
                                byteBufferReplaceOutputBuffer.put(byteBuffer.get(iPosition + 3));
                                iPosition += 4;
                            }
                        } else {
                            y.b();
                            return;
                        }
                    } else {
                        while (iPosition < iLimit) {
                            byteBufferReplaceOutputBuffer.put(byteBuffer.get(iPosition + 1));
                            byteBufferReplaceOutputBuffer.put(byteBuffer.get(iPosition + 2));
                            iPosition += 3;
                        }
                    }
                } else {
                    while (iPosition < iLimit) {
                        byteBufferReplaceOutputBuffer.put(byteBuffer.get(iPosition + 1));
                        byteBufferReplaceOutputBuffer.put(byteBuffer.get(iPosition));
                        iPosition += 2;
                    }
                }
            } else {
                while (iPosition < iLimit) {
                    short sConstrainValue = (short) (Util.constrainValue(byteBuffer.getFloat(iPosition), -1.0f, 1.0f) * 32767.0f);
                    byteBufferReplaceOutputBuffer.put((byte) (sConstrainValue & 255));
                    byteBufferReplaceOutputBuffer.put((byte) ((sConstrainValue >> 8) & 255));
                    iPosition += 4;
                }
            }
        } else {
            while (iPosition < iLimit) {
                byteBufferReplaceOutputBuffer.put((byte) 0);
                byteBufferReplaceOutputBuffer.put((byte) ((byteBuffer.get(iPosition) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) - 128));
                iPosition++;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferReplaceOutputBuffer.flip();
    }
}
