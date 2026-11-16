package androidx.media3.exoplayer.video;

import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.container.ObuParser;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@UnstableApi
public final class Av1SampleDependencyParser {
    private static final int MAX_OBU_COUNT_FOR_PARTIAL_SKIP = 8;

    @Nullable
    private ObuParser.SequenceHeader sequenceHeader;

    private void updateSequenceHeaders(List<ObuParser.Obu> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).type == 1) {
                this.sequenceHeader = ObuParser.SequenceHeader.parse(list.get(i));
            }
        }
    }

    public void reset() {
        this.sequenceHeader = null;
    }

    private boolean canSkipObu(ObuParser.Obu obu, boolean z) {
        ObuParser.SequenceHeader sequenceHeader;
        ObuParser.FrameHeader frameHeader;
        int i = obu.type;
        if (i == 2 || i == 15) {
            return true;
        }
        if (i != 3 || z) {
            return ((i != 6 && i != 3) || (sequenceHeader = this.sequenceHeader) == null || (frameHeader = ObuParser.FrameHeader.parse(sequenceHeader, obu)) == null || frameHeader.isDependedOn()) ? false : true;
        }
        return false;
    }

    public void queueInputBuffer(ByteBuffer byteBuffer) {
        updateSequenceHeaders(ObuParser.split(byteBuffer));
    }

    public int sampleLimitAfterSkippingNonReferenceFrame(ByteBuffer byteBuffer, boolean z) {
        List<ObuParser.Obu> listSplit = ObuParser.split(byteBuffer);
        updateSequenceHeaders(listSplit);
        int size = listSplit.size() - 1;
        int i = 0;
        while (size >= 0 && canSkipObu(listSplit.get(size), z)) {
            if (listSplit.get(size).type == 6 || listSplit.get(size).type == 3) {
                i++;
            }
            size--;
        }
        if (i <= 1 && size + 1 < 8) {
            if (size >= 0) {
                return listSplit.get(size).payload.limit();
            }
            return byteBuffer.position();
        }
        return byteBuffer.limit();
    }
}
