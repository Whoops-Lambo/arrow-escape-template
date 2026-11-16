package androidx.core.view.inputmethod;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;
import androidx.annotation.RequiresApi;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class InputContentInfoCompat {
    public final InputContentInfoCompatApi25Impl a;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class InputContentInfoCompatBaseImpl implements InputContentInfoCompatImpl {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface InputContentInfoCompatImpl {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @RequiresApi
    public static final class InputContentInfoCompatApi25Impl implements InputContentInfoCompatImpl {
        public final InputContentInfo a;

        public InputContentInfoCompatApi25Impl(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.a = new InputContentInfo(uri, clipDescription, uri2);
        }

        public InputContentInfoCompatApi25Impl(InputContentInfo inputContentInfo) {
            this.a = inputContentInfo;
        }
    }

    public InputContentInfoCompat(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.a = new InputContentInfoCompatApi25Impl(uri, clipDescription, uri2);
    }

    public InputContentInfoCompat(InputContentInfoCompatApi25Impl inputContentInfoCompatApi25Impl) {
        this.a = inputContentInfoCompatApi25Impl;
    }
}
