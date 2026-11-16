package androidx.core.os;

import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class OperationCanceledException extends RuntimeException {
    public OperationCanceledException(@Nullable String str) {
        super(str != null ? str.toString() : "The operation has been canceled.");
    }

    public OperationCanceledException() {
        this(null);
    }
}
