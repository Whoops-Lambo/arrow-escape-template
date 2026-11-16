package androidx.emoji2.text;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.KeyEvent;
import androidx.annotation.AnyThread;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.emoji2.text.flatbuffer.MetadataItem;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
@AnyThread
@RequiresApi
@RestrictTo
final class EmojiProcessor {
    public final EmojiCompat.SpanFactory a;
    public final MetadataRepo b;
    public final EmojiCompat.GlyphChecker c;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @RequiresApi
    public static final class CodepointIndexFinder {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class EmojiProcessAddSpanCallback implements EmojiProcessCallback<UnprecomputeTextOnModificationSpannable> {
        public UnprecomputeTextOnModificationSpannable a;
        public final EmojiCompat.SpanFactory b;

        @Override // androidx.emoji2.text.EmojiProcessor.EmojiProcessCallback
        public final boolean a(CharSequence charSequence, int i, int i2, TypefaceEmojiRasterizer typefaceEmojiRasterizer) {
            if ((typefaceEmojiRasterizer.c & 4) > 0) {
                return true;
            }
            if (this.a == null) {
                this.a = new UnprecomputeTextOnModificationSpannable(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
            }
            this.a.setSpan(this.b.a(typefaceEmojiRasterizer), i, i2, 33);
            return true;
        }

        @Override // androidx.emoji2.text.EmojiProcessor.EmojiProcessCallback
        public final Object getResult() {
            return this.a;
        }

        public EmojiProcessAddSpanCallback(UnprecomputeTextOnModificationSpannable unprecomputeTextOnModificationSpannable, EmojiCompat.SpanFactory spanFactory) {
            this.a = unprecomputeTextOnModificationSpannable;
            this.b = spanFactory;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface EmojiProcessCallback<T> {
        boolean a(CharSequence charSequence, int i, int i2, TypefaceEmojiRasterizer typefaceEmojiRasterizer);

        Object getResult();
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class EmojiProcessLookupCallback implements EmojiProcessCallback<EmojiProcessLookupCallback> {
        @Override // androidx.emoji2.text.EmojiProcessor.EmojiProcessCallback
        public final boolean a(CharSequence charSequence, int i, int i2, TypefaceEmojiRasterizer typefaceEmojiRasterizer) {
            return (i > 0 || i2 <= 0) && i2 <= 0;
        }

        @Override // androidx.emoji2.text.EmojiProcessor.EmojiProcessCallback
        public final Object getResult() {
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class ProcessorSm {
        public int a = 1;
        public final MetadataRepo.Node b;
        public MetadataRepo.Node c;
        public MetadataRepo.Node d;
        public int e;
        public int f;

        public final void a() {
            this.a = 1;
            this.c = this.b;
            this.f = 0;
        }

        public final boolean b() {
            MetadataItem metadataItemB = this.c.b.b();
            int iA = metadataItemB.a(6);
            return !(iA == 0 || metadataItemB.b.get(iA + metadataItemB.a) == 0) || this.e == 65039;
        }

        public ProcessorSm(MetadataRepo.Node node) {
            this.b = node;
            this.c = node;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class MarkExclusionCallback implements EmojiProcessCallback<MarkExclusionCallback> {
        public final String a;

        @Override // androidx.emoji2.text.EmojiProcessor.EmojiProcessCallback
        public final Object getResult() {
            return this;
        }

        public MarkExclusionCallback(String str) {
            this.a = str;
        }

        @Override // androidx.emoji2.text.EmojiProcessor.EmojiProcessCallback
        public final boolean a(CharSequence charSequence, int i, int i2, TypefaceEmojiRasterizer typefaceEmojiRasterizer) {
            if (TextUtils.equals(charSequence.subSequence(i, i2), this.a)) {
                typefaceEmojiRasterizer.c = (typefaceEmojiRasterizer.c & 3) | 4;
                return false;
            }
            return true;
        }
    }

    public final boolean b(CharSequence charSequence, int i, int i2, TypefaceEmojiRasterizer typefaceEmojiRasterizer) {
        if ((typefaceEmojiRasterizer.c & 3) == 0) {
            EmojiCompat.GlyphChecker glyphChecker = this.c;
            MetadataItem metadataItemB = typefaceEmojiRasterizer.b();
            int iA = metadataItemB.a(8);
            if (iA != 0) {
                metadataItemB.b.getShort(iA + metadataItemB.a);
            }
            boolean zA = glyphChecker.a(charSequence, i, i2);
            int i3 = typefaceEmojiRasterizer.c & 4;
            typefaceEmojiRasterizer.c = zA ? i3 | 2 : i3 | 1;
        }
        return (typefaceEmojiRasterizer.c & 3) == 2;
    }

    public final Object c(CharSequence charSequence, int i, int i2, int i3, boolean z, EmojiProcessCallback emojiProcessCallback) {
        int i4;
        char c;
        ProcessorSm processorSm = new ProcessorSm(this.b.c);
        int iCodePointAt = Character.codePointAt(charSequence, i);
        int i5 = 0;
        boolean zA = true;
        int iCharCount = i;
        loop0: while (true) {
            i4 = iCharCount;
            while (true) {
                if (iCharCount < i2 && i5 < i3 && zA) {
                    SparseArray sparseArray = processorSm.c.a;
                    MetadataRepo.Node node = sparseArray == null ? null : (MetadataRepo.Node) sparseArray.get(iCodePointAt);
                    if (processorSm.a == 2) {
                        if (node != null) {
                            processorSm.c = node;
                            processorSm.f++;
                        } else {
                            if (iCodePointAt == 65038) {
                                processorSm.a();
                            } else if (iCodePointAt != 65039) {
                                MetadataRepo.Node node2 = processorSm.c;
                                if (node2.b != null) {
                                    if (processorSm.f != 1) {
                                        processorSm.d = node2;
                                        processorSm.a();
                                    } else if (processorSm.b()) {
                                        processorSm.d = processorSm.c;
                                        processorSm.a();
                                    } else {
                                        processorSm.a();
                                    }
                                    c = 3;
                                } else {
                                    processorSm.a();
                                }
                            }
                            c = 1;
                        }
                        c = 2;
                    } else if (node == null) {
                        processorSm.a();
                        c = 1;
                    } else {
                        processorSm.a = 2;
                        processorSm.c = node;
                        processorSm.f = 1;
                        c = 2;
                    }
                    processorSm.e = iCodePointAt;
                    if (c == 1) {
                        iCharCount = Character.charCount(Character.codePointAt(charSequence, i4)) + i4;
                        if (iCharCount >= i2) {
                            break;
                        }
                        iCodePointAt = Character.codePointAt(charSequence, iCharCount);
                        break;
                    }
                    if (c == 2) {
                        int iCharCount2 = Character.charCount(iCodePointAt) + iCharCount;
                        if (iCharCount2 < i2) {
                            iCodePointAt = Character.codePointAt(charSequence, iCharCount2);
                        }
                        iCharCount = iCharCount2;
                    } else if (c == 3) {
                        if (!z && b(charSequence, i4, iCharCount, processorSm.d.b)) {
                            break;
                        }
                        zA = emojiProcessCallback.a(charSequence, i4, iCharCount, processorSm.d.b);
                        i5++;
                        break;
                    }
                } else {
                    break loop0;
                }
            }
        }
        if (processorSm.a == 2 && processorSm.c.b != null && ((processorSm.f > 1 || processorSm.b()) && i5 < i3 && zA && (z || !b(charSequence, i4, iCharCount, processorSm.c.b)))) {
            emojiProcessCallback.a(charSequence, i4, iCharCount, processorSm.c.b);
        }
        return emojiProcessCallback.getResult();
    }

    public EmojiProcessor(MetadataRepo metadataRepo, EmojiCompat.DefaultSpanFactory defaultSpanFactory, EmojiCompat.GlyphChecker glyphChecker, Set set) {
        this.a = defaultSpanFactory;
        this.b = metadataRepo;
        this.c = glyphChecker;
        if (!set.isEmpty()) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                int[] iArr = (int[]) it.next();
                String str = new String(iArr, 0, iArr.length);
                c(str, 0, str.length(), 1, true, new MarkExclusionCallback(str));
            }
        }
    }

    public static boolean a(Editable editable, KeyEvent keyEvent, boolean z) {
        EmojiSpan[] emojiSpanArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (emojiSpanArr = (EmojiSpan[]) editable.getSpans(selectionStart, selectionEnd, EmojiSpan.class)) != null && emojiSpanArr.length > 0) {
                for (EmojiSpan emojiSpan : emojiSpanArr) {
                    int spanStart = editable.getSpanStart(emojiSpan);
                    int spanEnd = editable.getSpanEnd(emojiSpan);
                    if ((z && spanStart == selectionStart) || ((!z && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
