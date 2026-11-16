package androidx.emoji2.text;

import androidx.annotation.AnyThread;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.emoji2.text.flatbuffer.MetadataList;
import defpackage.dr0;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@AnyThread
@RequiresApi
@RestrictTo
class MetadataListReader {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class ByteBufferReader implements OpenTypeReader {
        public final ByteBuffer a;

        public final void a(int i) {
            ByteBuffer byteBuffer = this.a;
            byteBuffer.position(byteBuffer.position() + i);
        }

        public ByteBufferReader(ByteBuffer byteBuffer) {
            this.a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class InputStreamOpenTypeReader implements OpenTypeReader {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class OffsetInfo {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface OpenTypeReader {
    }

    public static MetadataList a(MappedByteBuffer mappedByteBuffer) throws IOException {
        ByteBuffer byteBuffer;
        long j;
        ByteBuffer byteBufferDuplicate = mappedByteBuffer.duplicate();
        ByteBufferReader byteBufferReader = new ByteBufferReader(byteBufferDuplicate);
        int i = 4;
        byteBufferReader.a(4);
        int i2 = byteBufferDuplicate.getShort() & 65535;
        if (i2 <= 100) {
            byteBufferReader.a(6);
            int i3 = 0;
            while (true) {
                byteBuffer = byteBufferReader.a;
                if (i3 < i2) {
                    int i4 = byteBuffer.getInt();
                    byteBufferReader.a(i);
                    j = ((long) byteBuffer.getInt()) & 4294967295L;
                    byteBufferReader.a(i);
                    if (1835365473 == i4) {
                        break;
                    }
                    i3++;
                    i = 4;
                } else {
                    j = -1;
                    break;
                }
            }
            if (j != -1) {
                byteBufferReader.a((int) (j - ((long) byteBuffer.position())));
                byteBufferReader.a(12);
                long j2 = ((long) byteBuffer.getInt()) & 4294967295L;
                for (int i5 = 0; i5 < j2; i5++) {
                    int i6 = byteBuffer.getInt();
                    long j3 = ((long) byteBuffer.getInt()) & 4294967295L;
                    byteBuffer.getInt();
                    if (1164798569 == i6 || 1701669481 == i6) {
                        byteBufferDuplicate.position((int) (j3 + j));
                        MetadataList metadataList = new MetadataList();
                        byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
                        int iPosition = byteBufferDuplicate.position() + byteBufferDuplicate.getInt(byteBufferDuplicate.position());
                        metadataList.b = byteBufferDuplicate;
                        metadataList.a = iPosition;
                        int i7 = iPosition - byteBufferDuplicate.getInt(iPosition);
                        metadataList.c = i7;
                        metadataList.d = metadataList.b.getShort(i7);
                        return metadataList;
                    }
                }
            }
            dr0.h("Cannot read metadata.");
            return null;
        }
        dr0.h("Cannot read metadata.");
        return null;
    }
}
