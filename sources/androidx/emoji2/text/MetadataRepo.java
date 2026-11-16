package androidx.emoji2.text;

import android.graphics.Typeface;
import android.util.SparseArray;
import androidx.annotation.AnyThread;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.util.Preconditions;
import androidx.emoji2.text.flatbuffer.MetadataItem;
import androidx.emoji2.text.flatbuffer.MetadataList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@AnyThread
@RequiresApi
public final class MetadataRepo {
    public final MetadataList a;
    public final char[] b;
    public final Node c = new Node(1024);
    public final Typeface d;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @RestrictTo
    public static class Node {
        public final SparseArray a;
        public TypefaceEmojiRasterizer b;

        public Node(int i) {
            this.a = new SparseArray(i);
        }

        public final void a(TypefaceEmojiRasterizer typefaceEmojiRasterizer, int i, int i2) {
            Node node;
            int iA = typefaceEmojiRasterizer.a(i);
            SparseArray sparseArray = this.a;
            if (sparseArray == null) {
                node = null;
            } else {
                node = (Node) sparseArray.get(iA);
            }
            if (node == null) {
                node = new Node(1);
                sparseArray.put(typefaceEmojiRasterizer.a(i), node);
            }
            if (i2 > i) {
                node.a(typefaceEmojiRasterizer, i + 1, i2);
            } else {
                node.b = typefaceEmojiRasterizer;
            }
        }
    }

    public MetadataRepo(Typeface typeface, MetadataList metadataList) {
        int i;
        int i2;
        int i3;
        int i4;
        boolean z;
        int i5;
        this.d = typeface;
        this.a = metadataList;
        int iA = metadataList.a(6);
        if (iA != 0) {
            int i6 = iA + metadataList.a;
            i = metadataList.b.getInt(metadataList.b.getInt(i6) + i6);
        } else {
            i = 0;
        }
        this.b = new char[i * 2];
        int iA2 = metadataList.a(6);
        if (iA2 != 0) {
            int i7 = iA2 + metadataList.a;
            i2 = metadataList.b.getInt(metadataList.b.getInt(i7) + i7);
        } else {
            i2 = 0;
        }
        for (int i8 = 0; i8 < i2; i8++) {
            TypefaceEmojiRasterizer typefaceEmojiRasterizer = new TypefaceEmojiRasterizer(this, i8);
            MetadataItem metadataItemB = typefaceEmojiRasterizer.b();
            int iA3 = metadataItemB.a(4);
            if (iA3 != 0) {
                i3 = metadataItemB.b.getInt(iA3 + metadataItemB.a);
            } else {
                i3 = 0;
            }
            Character.toChars(i3, this.b, i8 * 2);
            MetadataItem metadataItemB2 = typefaceEmojiRasterizer.b();
            int iA4 = metadataItemB2.a(16);
            if (iA4 != 0) {
                int i9 = iA4 + metadataItemB2.a;
                i4 = metadataItemB2.b.getInt(metadataItemB2.b.getInt(i9) + i9);
            } else {
                i4 = 0;
            }
            if (i4 > 0) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.a("invalid metadata codepoint length", z);
            Node node = this.c;
            MetadataItem metadataItemB3 = typefaceEmojiRasterizer.b();
            int iA5 = metadataItemB3.a(16);
            if (iA5 != 0) {
                int i10 = iA5 + metadataItemB3.a;
                i5 = metadataItemB3.b.getInt(metadataItemB3.b.getInt(i10) + i10);
            } else {
                i5 = 0;
            }
            node.a(typefaceEmojiRasterizer, 0, i5 - 1);
        }
    }
}
