package defpackage;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.text.Subtitle;
import com.google.android.exoplayer2.text.SubtitleDecoder;
import com.google.android.exoplayer2.text.SubtitleInputBuffer;
import com.google.android.exoplayer2.text.SubtitleOutputBuffer;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.util.ArrayDeque;
import java.util.PriorityQueue;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class sp implements SubtitleDecoder {
    private static final int NUM_INPUT_BUFFERS = 10;
    private static final int NUM_OUTPUT_BUFFERS = 2;
    private final ArrayDeque<qp> availableInputBuffers = new ArrayDeque<>();
    private final ArrayDeque<SubtitleOutputBuffer> availableOutputBuffers;

    @Nullable
    private qp dequeuedInputBuffer;
    private long playbackPositionUs;
    private long queuedInputBufferCount;
    private final PriorityQueue<qp> queuedInputBuffers;

    public abstract Subtitle createSubtitle();

    public abstract void decode(SubtitleInputBuffer subtitleInputBuffer);

    public abstract boolean isNewSubtitleDataAvailable();

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.android.exoplayer2.decoder.Decoder
    public SubtitleInputBuffer dequeueInputBuffer() {
        Assertions.checkState(this.dequeuedInputBuffer == null);
        if (this.availableInputBuffers.isEmpty()) {
            return null;
        }
        qp qpVarPollFirst = this.availableInputBuffers.pollFirst();
        this.dequeuedInputBuffer = qpVarPollFirst;
        return qpVarPollFirst;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.android.exoplayer2.decoder.Decoder
    public SubtitleOutputBuffer dequeueOutputBuffer() {
        if (this.availableOutputBuffers.isEmpty()) {
            return null;
        }
        while (!this.queuedInputBuffers.isEmpty() && ((qp) Util.castNonNull(this.queuedInputBuffers.peek())).timeUs <= this.playbackPositionUs) {
            qp qpVar = (qp) Util.castNonNull(this.queuedInputBuffers.poll());
            if (qpVar.isEndOfStream()) {
                SubtitleOutputBuffer subtitleOutputBuffer = (SubtitleOutputBuffer) Util.castNonNull(this.availableOutputBuffers.pollFirst());
                subtitleOutputBuffer.addFlag(4);
                qpVar.clear();
                this.availableInputBuffers.add(qpVar);
                return subtitleOutputBuffer;
            }
            decode(qpVar);
            if (isNewSubtitleDataAvailable()) {
                Subtitle subtitleCreateSubtitle = createSubtitle();
                SubtitleOutputBuffer subtitleOutputBuffer2 = (SubtitleOutputBuffer) Util.castNonNull(this.availableOutputBuffers.pollFirst());
                subtitleOutputBuffer2.setContent(qpVar.timeUs, subtitleCreateSubtitle, Long.MAX_VALUE);
                qpVar.clear();
                this.availableInputBuffers.add(qpVar);
                return subtitleOutputBuffer2;
            }
            qpVar.clear();
            this.availableInputBuffers.add(qpVar);
        }
        return null;
    }

    @Override // com.google.android.exoplayer2.decoder.Decoder
    public void flush() {
        this.queuedInputBufferCount = 0L;
        this.playbackPositionUs = 0L;
        while (!this.queuedInputBuffers.isEmpty()) {
            qp qpVar = (qp) Util.castNonNull(this.queuedInputBuffers.poll());
            qpVar.clear();
            this.availableInputBuffers.add(qpVar);
        }
        qp qpVar2 = this.dequeuedInputBuffer;
        if (qpVar2 != null) {
            qpVar2.clear();
            this.availableInputBuffers.add(qpVar2);
            this.dequeuedInputBuffer = null;
        }
    }

    @Nullable
    public final SubtitleOutputBuffer getAvailableOutputBuffer() {
        return this.availableOutputBuffers.pollFirst();
    }

    public final long getPositionUs() {
        return this.playbackPositionUs;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.android.exoplayer2.decoder.Decoder
    public void queueInputBuffer(SubtitleInputBuffer subtitleInputBuffer) {
        Assertions.checkArgument(subtitleInputBuffer == this.dequeuedInputBuffer);
        qp qpVar = (qp) subtitleInputBuffer;
        if (qpVar.isDecodeOnly()) {
            qpVar.clear();
            this.availableInputBuffers.add(qpVar);
        } else {
            long j = this.queuedInputBufferCount;
            this.queuedInputBufferCount = 1 + j;
            qpVar.a = j;
            this.queuedInputBuffers.add(qpVar);
        }
        this.dequeuedInputBuffer = null;
    }

    @Override // com.google.android.exoplayer2.text.SubtitleDecoder
    public void setPositionUs(long j) {
        this.playbackPositionUs = j;
    }

    public sp() {
        for (int i = 0; i < 10; i++) {
            this.availableInputBuffers.add(new qp());
        }
        this.availableOutputBuffers = new ArrayDeque<>();
        for (int i2 = 0; i2 < 2; i2++) {
            ArrayDeque<SubtitleOutputBuffer> arrayDeque = this.availableOutputBuffers;
            t5 t5Var = new t5(this, 6);
            rp rpVar = new rp();
            rpVar.a = t5Var;
            arrayDeque.add(rpVar);
        }
        this.queuedInputBuffers = new PriorityQueue<>();
    }

    public void releaseOutputBuffer(SubtitleOutputBuffer subtitleOutputBuffer) {
        subtitleOutputBuffer.clear();
        this.availableOutputBuffers.add(subtitleOutputBuffer);
    }
}
