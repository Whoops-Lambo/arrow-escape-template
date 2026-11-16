package com.google.android.exoplayer2.upstream;

import android.os.Handler;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Assertions;
import defpackage.va;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public interface BandwidthMeter {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface EventListener {

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public static final class EventDispatcher {
            private final CopyOnWriteArrayList<a> listeners = new CopyOnWriteArrayList<>();

            /* JADX INFO: Access modifiers changed from: private */
            public static /* synthetic */ void lambda$bandwidthSample$0(a aVar, int i, long j, long j2) {
                aVar.b.onBandwidthSample(i, j, j2);
            }

            public void bandwidthSample(int i, long j, long j2) {
                int i2;
                long j3;
                long j4;
                for (a aVar : this.listeners) {
                    if (aVar.c) {
                        i2 = i;
                        j3 = j;
                        j4 = j2;
                    } else {
                        i2 = i;
                        j3 = j;
                        j4 = j2;
                        aVar.a.post(new va(aVar, i2, j3, j4, 2));
                    }
                    i = i2;
                    j = j3;
                    j2 = j4;
                }
            }

            public void removeListener(EventListener eventListener) {
                for (a aVar : this.listeners) {
                    if (aVar.b == eventListener) {
                        aVar.c = true;
                        this.listeners.remove(aVar);
                    }
                }
            }

            public void addListener(Handler handler, EventListener eventListener) {
                Assertions.checkNotNull(handler);
                Assertions.checkNotNull(eventListener);
                removeListener(eventListener);
                this.listeners.add(new a(handler, eventListener));
            }
        }

        void onBandwidthSample(int i, long j, long j2);
    }

    void addEventListener(Handler handler, EventListener eventListener);

    long getBitrateEstimate();

    @Nullable
    TransferListener getTransferListener();

    void removeEventListener(EventListener eventListener);

    default long getTimeToFirstByteEstimateUs() {
        return -9223372036854775807L;
    }
}
