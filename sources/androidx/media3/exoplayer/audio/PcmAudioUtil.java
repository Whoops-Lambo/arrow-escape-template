package androidx.media3.exoplayer.audio;

import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import com.inmobi.media.core.config.models.AdConfig;
import com.unity3d.services.UnityAdsConstants;
import io.p071bidmachine.media3.extractor.ts.y;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
@UnstableApi
public final class PcmAudioUtil {
    public static int readAs32BitIntPcm(ByteBuffer byteBuffer, int i) {
        if (i == 2) {
            return ((byteBuffer.get() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | ((byteBuffer.get() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16);
        }
        if (i == 3) {
            return (byteBuffer.get() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24;
        }
        if (i == 4) {
            float fConstrainValue = Util.constrainValue(byteBuffer.getFloat(), -1.0f, 1.0f);
            return fConstrainValue < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? (int) ((-fConstrainValue) * (-2.1474836E9f)) : (int) (fConstrainValue * 2.1474836E9f);
        }
        if (i == 21) {
            return ((byteBuffer.get() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | ((byteBuffer.get() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | ((byteBuffer.get() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16);
        }
        if (i == 22) {
            return ((byteBuffer.get() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | (byteBuffer.get() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((byteBuffer.get() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | ((byteBuffer.get() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16);
        }
        if (i == 268435456) {
            return ((byteBuffer.get() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((byteBuffer.get() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24);
        }
        if (i == 1342177280) {
            return ((byteBuffer.get() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | ((byteBuffer.get() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | ((byteBuffer.get() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16);
        }
        if (i == 1610612736) {
            return (byteBuffer.get() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((byteBuffer.get() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | ((byteBuffer.get() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((byteBuffer.get() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8);
        }
        y.b();
        return 0;
    }

    public static void write32BitIntPcm(ByteBuffer byteBuffer, int i, int i2) {
        if (i2 == 2) {
            byteBuffer.put((byte) (i >> 16));
            byteBuffer.put((byte) (i >> 24));
            return;
        }
        if (i2 == 3) {
            byteBuffer.put((byte) (i >> 24));
            return;
        }
        if (i2 == 4) {
            if (i < 0) {
                byteBuffer.putFloat((-i) / (-2.1474836E9f));
                return;
            } else {
                byteBuffer.putFloat(i / 2.1474836E9f);
                return;
            }
        }
        if (i2 == 21) {
            byteBuffer.put((byte) (i >> 8));
            byteBuffer.put((byte) (i >> 16));
            byteBuffer.put((byte) (i >> 24));
            return;
        }
        if (i2 == 22) {
            byteBuffer.put((byte) i);
            byteBuffer.put((byte) (i >> 8));
            byteBuffer.put((byte) (i >> 16));
            byteBuffer.put((byte) (i >> 24));
            return;
        }
        if (i2 == 268435456) {
            byteBuffer.put((byte) (i >> 24));
            byteBuffer.put((byte) (i >> 16));
            return;
        }
        if (i2 == 1342177280) {
            byteBuffer.put((byte) (i >> 24));
            byteBuffer.put((byte) (i >> 16));
            byteBuffer.put((byte) (i >> 8));
        } else {
            if (i2 != 1610612736) {
                y.b();
                return;
            }
            byteBuffer.put((byte) (i >> 24));
            byteBuffer.put((byte) (i >> 16));
            byteBuffer.put((byte) (i >> 8));
            byteBuffer.put((byte) i);
        }
    }

    private PcmAudioUtil() {
    }

    public static ByteBuffer rampUpVolume(ByteBuffer byteBuffer, int i, int i2, int i3, int i4) {
        ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(byteBuffer.remaining()).order(ByteOrder.nativeOrder());
        int iPosition = byteBuffer.position();
        while (byteBuffer.hasRemaining() && i3 < i4) {
            write32BitIntPcm(byteBufferOrder, (int) ((((long) readAs32BitIntPcm(byteBuffer, i)) * ((long) i3)) / ((long) i4)), i);
            if (byteBuffer.position() == iPosition + i2) {
                i3++;
                iPosition = byteBuffer.position();
            }
        }
        byteBufferOrder.put(byteBuffer);
        byteBufferOrder.flip();
        return byteBufferOrder;
    }
}
