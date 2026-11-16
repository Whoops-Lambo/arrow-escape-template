package androidx.emoji2.text;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import androidx.annotation.AnyThread;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.collection.ArraySet;
import androidx.core.util.Preconditions;
import androidx.emoji2.text.flatbuffer.MetadataList;
import defpackage.d;
import defpackage.e32;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@AnyThread
public class EmojiCompat {
    public static final Object j = new Object();
    public static volatile EmojiCompat k;
    public final ReentrantReadWriteLock a;
    public final ArraySet b;
    public volatile int c;
    public final Handler d;
    public final CompatInternal19 e;
    public final MetadataRepoLoader f;
    public final DefaultSpanFactory g;
    public final int h;
    public final GlyphChecker i;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface CodepointSequenceMatchResult {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @RequiresApi
    public static final class CompatInternal19 extends CompatInternal {
        public volatile EmojiProcessor b;
        public volatile MetadataRepo c;

        /* JADX INFO: renamed from: androidx.emoji2.text.EmojiCompat$CompatInternal19$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        /* JADX INFO: loaded from: classes9.dex */
        class AnonymousClass1 extends MetadataRepoLoaderCallback {
            @Override // androidx.emoji2.text.EmojiCompat.MetadataRepoLoaderCallback
            public final void a(Throwable th) {
                CompatInternal19.this.a.f(th);
            }

            @Override // androidx.emoji2.text.EmojiCompat.MetadataRepoLoaderCallback
            public final void b(MetadataRepo metadataRepo) {
                CompatInternal19 compatInternal19 = CompatInternal19.this;
                compatInternal19.c = metadataRepo;
                MetadataRepo metadataRepo2 = compatInternal19.c;
                EmojiCompat emojiCompat = compatInternal19.a;
                compatInternal19.b = new EmojiProcessor(metadataRepo2, emojiCompat.g, emojiCompat.i, Build.VERSION.SDK_INT >= 34 ? EmojiExclusions.EmojiExclusions_Api34.a() : EmojiExclusions.EmojiExclusions_Reflections.a());
                EmojiCompat emojiCompat2 = compatInternal19.a;
                ArrayList arrayList = new ArrayList();
                emojiCompat2.a.writeLock().lock();
                try {
                    emojiCompat2.c = 1;
                    arrayList.addAll(emojiCompat2.b);
                    emojiCompat2.b.clear();
                    emojiCompat2.a.writeLock().unlock();
                    emojiCompat2.d.post(new ListenerDispatcher(arrayList, emojiCompat2.c, null));
                } catch (Throwable th) {
                    emojiCompat2.a.writeLock().unlock();
                    throw th;
                }
            }

            public AnonymousClass1() {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @RestrictTo
    public static class DefaultSpanFactory implements SpanFactory {
        @Override // androidx.emoji2.text.EmojiCompat.SpanFactory
        public final TypefaceEmojiSpan a(TypefaceEmojiRasterizer typefaceEmojiRasterizer) {
            return new TypefaceEmojiSpan(typefaceEmojiRasterizer);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface GlyphChecker {
        boolean a(CharSequence charSequence, int i, int i2);
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static abstract class InitCallback {
        public void a() {
        }

        public void b() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class ListenerDispatcher implements Runnable {
        public final ArrayList a;
        public final int b;

        @Override // java.lang.Runnable
        public final void run() {
            ArrayList arrayList = this.a;
            int size = arrayList.size();
            int i = 0;
            if (this.b != 1) {
                while (i < size) {
                    ((InitCallback) arrayList.get(i)).a();
                    i++;
                }
            } else {
                while (i < size) {
                    ((InitCallback) arrayList.get(i)).b();
                    i++;
                }
            }
        }

        public ListenerDispatcher(List list, int i, Throwable th) {
            Preconditions.c(list, "initCallbacks cannot be null");
            this.a = new ArrayList(list);
            this.b = i;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface LoadStrategy {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface MetadataRepoLoader {
        void a(MetadataRepoLoaderCallback metadataRepoLoaderCallback);
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static abstract class MetadataRepoLoaderCallback {
        public abstract void a(Throwable th);

        public abstract void b(MetadataRepo metadataRepo);
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface ReplaceStrategy {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface SpanFactory {
        TypefaceEmojiSpan a(TypefaceEmojiRasterizer typefaceEmojiRasterizer);
    }

    public static boolean c(InputConnection inputConnection, Editable editable, int i, int i2, boolean z) {
        int iMin;
        if (editable != null && i >= 0 && i2 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd) {
                if (z) {
                    int iMax = Math.max(i, 0);
                    int length = editable.length();
                    if (selectionStart >= 0 && length >= selectionStart && iMax >= 0) {
                        loop0: while (true) {
                            boolean z2 = false;
                            while (true) {
                                if (iMax == 0) {
                                    break loop0;
                                }
                                selectionStart--;
                                if (selectionStart < 0) {
                                    if (!z2) {
                                        selectionStart = 0;
                                        break loop0;
                                    }
                                    break loop0;
                                }
                                char cCharAt = editable.charAt(selectionStart);
                                if (z2) {
                                    if (Character.isHighSurrogate(cCharAt)) {
                                        iMax--;
                                    }
                                } else if (!Character.isSurrogate(cCharAt)) {
                                    iMax--;
                                } else if (!Character.isHighSurrogate(cCharAt)) {
                                    z2 = true;
                                }
                                selectionStart = -1;
                                break loop0;
                            }
                        }
                    }
                    selectionStart = -1;
                    break loop0;
                    int iMax2 = Math.max(i2, 0);
                    iMin = editable.length();
                    if (selectionEnd >= 0 && iMin >= selectionEnd && iMax2 >= 0) {
                        loop2: while (true) {
                            boolean z3 = false;
                            while (true) {
                                if (iMax2 != 0) {
                                    if (selectionEnd >= iMin) {
                                        if (!z3) {
                                            break loop2;
                                        }
                                        break loop2;
                                    }
                                    char cCharAt2 = editable.charAt(selectionEnd);
                                    if (z3) {
                                        if (Character.isLowSurrogate(cCharAt2)) {
                                            iMax2--;
                                            selectionEnd++;
                                        }
                                    } else if (!Character.isSurrogate(cCharAt2)) {
                                        iMax2--;
                                        selectionEnd++;
                                    } else if (!Character.isLowSurrogate(cCharAt2)) {
                                        selectionEnd++;
                                        z3 = true;
                                    }
                                    iMin = -1;
                                    break loop2;
                                }
                                iMin = selectionEnd;
                                break loop2;
                            }
                        }
                    }
                    iMin = -1;
                    break loop2;
                    if (selectionStart != -1 && iMin != -1) {
                    }
                } else {
                    selectionStart = Math.max(selectionStart - i, 0);
                    iMin = Math.min(selectionEnd + i2, editable.length());
                }
                EmojiSpan[] emojiSpanArr = (EmojiSpan[]) editable.getSpans(selectionStart, iMin, EmojiSpan.class);
                if (emojiSpanArr != null && emojiSpanArr.length > 0) {
                    for (EmojiSpan emojiSpan : emojiSpanArr) {
                        int spanStart = editable.getSpanStart(emojiSpan);
                        int spanEnd = editable.getSpanEnd(emojiSpan);
                        selectionStart = Math.min(spanStart, selectionStart);
                        iMin = Math.max(spanEnd, iMin);
                    }
                    int iMax3 = Math.max(selectionStart, 0);
                    int iMin2 = Math.min(iMin, editable.length());
                    InputConnectionWrapper inputConnectionWrapper = (InputConnectionWrapper) inputConnection;
                    inputConnectionWrapper.beginBatchEdit();
                    editable.delete(iMax3, iMin2);
                    inputConnectionWrapper.endBatchEdit();
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class CompatInternal {
        public final EmojiCompat a;

        public CompatInternal(EmojiCompat emojiCompat) {
            this.a = emojiCompat;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static abstract class Config {
        public final MetadataRepoLoader a;
        public int b = 0;
        public final GlyphChecker c = new DefaultGlyphChecker();

        public Config(MetadataRepoLoader metadataRepoLoader) {
            this.a = metadataRepoLoader;
        }
    }

    public static EmojiCompat a() {
        EmojiCompat emojiCompat;
        synchronized (j) {
            try {
                emojiCompat = k;
                if (!(emojiCompat != null)) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return emojiCompat;
    }

    public static boolean d(Editable editable, int i, KeyEvent keyEvent) {
        boolean zA;
        if (i != 67) {
            zA = i != 112 ? false : EmojiProcessor.a(editable, keyEvent, true);
        } else {
            zA = EmojiProcessor.a(editable, keyEvent, false);
        }
        if (!zA) {
            return false;
        }
        MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
        return true;
    }

    public final int b() {
        this.a.readLock().lock();
        try {
            return this.c;
        } finally {
            this.a.readLock().unlock();
        }
    }

    public final void e() {
        if (!(this.h == 1)) {
            e32.i("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
            return;
        }
        if (b() == 1) {
            return;
        }
        this.a.writeLock().lock();
        try {
            if (this.c == 0) {
                this.a.writeLock().unlock();
                return;
            }
            this.c = 0;
            this.a.writeLock().unlock();
            CompatInternal19 compatInternal19 = this.e;
            EmojiCompat emojiCompat = compatInternal19.a;
            try {
                emojiCompat.f.a(compatInternal19.new AnonymousClass1());
            } catch (Throwable th) {
                emojiCompat.f(th);
            }
        } catch (Throwable th2) {
            this.a.writeLock().unlock();
            throw th2;
        }
    }

    public final void f(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.a.writeLock().lock();
        try {
            this.c = 2;
            arrayList.addAll(this.b);
            this.b.clear();
            this.a.writeLock().unlock();
            this.d.post(new ListenerDispatcher(arrayList, this.c, th));
        } catch (Throwable th2) {
            this.a.writeLock().unlock();
            throw th2;
        }
    }

    public final void h(InitCallback initCallback) {
        Preconditions.c(initCallback, "initCallback cannot be null");
        this.a.writeLock().lock();
        try {
            if (this.c == 1 || this.c == 2) {
                this.d.post(new ListenerDispatcher(Arrays.asList(initCallback), this.c, null));
            } else {
                this.b.add(initCallback);
            }
        } finally {
            this.a.writeLock().unlock();
        }
    }

    public EmojiCompat(Config config) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.a = reentrantReadWriteLock;
        this.c = 3;
        MetadataRepoLoader metadataRepoLoader = config.a;
        this.f = metadataRepoLoader;
        int i = config.b;
        this.h = i;
        this.i = config.c;
        this.d = new Handler(Looper.getMainLooper());
        this.b = new ArraySet(0);
        this.g = new DefaultSpanFactory();
        CompatInternal19 compatInternal19 = new CompatInternal19(this);
        this.e = compatInternal19;
        reentrantReadWriteLock.writeLock().lock();
        if (i == 0) {
            try {
                this.c = 0;
            } catch (Throwable th) {
                this.a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (b() == 0) {
            try {
                metadataRepoLoader.a(compatInternal19.new AnonymousClass1());
            } catch (Throwable th2) {
                f(th2);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:53:0x009f A[Catch: all -> 0x0082, TryCatch #0 {all -> 0x0082, blocks: (B:33:0x005a, B:36:0x005f, B:38:0x0063, B:40:0x0070, B:47:0x008f, B:49:0x0099, B:51:0x009c, B:53:0x009f, B:55:0x00af, B:56:0x00b2), top: B:90:0x005a }] */
    /* JADX WARN: Code duplicated, block: B:55:0x00af A[Catch: all -> 0x0082, TryCatch #0 {all -> 0x0082, blocks: (B:33:0x005a, B:36:0x005f, B:38:0x0063, B:40:0x0070, B:47:0x008f, B:49:0x0099, B:51:0x009c, B:53:0x009f, B:55:0x00af, B:56:0x00b2), top: B:90:0x005a }] */
    /* JADX WARN: Code duplicated, block: B:62:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:81:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:97:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:? A[RETURN, SYNTHETIC] */
    public final CharSequence g(CharSequence charSequence, int i, int i2) throws Throwable {
        boolean z;
        boolean z2;
        boolean z3;
        Throwable th;
        CharSequence charSequence2;
        int i3;
        int i4;
        EmojiSpan[] emojiSpanArr;
        int spanStart;
        boolean z4 = true;
        if (b() == 1) {
            z = true;
        } else {
            z = false;
        }
        UnprecomputeTextOnModificationSpannable unprecomputeTextOnModificationSpannable = null;
        if (z) {
            if (i >= 0) {
                if (i2 >= 0) {
                    if (i <= i2) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    Preconditions.a("start should be <= than end", z2);
                    if (charSequence == null) {
                        return null;
                    }
                    if (i <= charSequence.length()) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    Preconditions.a("start should be < than charSequence length", z3);
                    if (i2 > charSequence.length()) {
                        z4 = false;
                    }
                    Preconditions.a("end should be < than charSequence length", z4);
                    if (charSequence.length() == 0 || i == i2) {
                        return charSequence;
                    }
                    EmojiProcessor emojiProcessor = this.e.b;
                    emojiProcessor.getClass();
                    boolean z5 = charSequence instanceof SpannableBuilder;
                    if (z5) {
                        ((SpannableBuilder) charSequence).a();
                    }
                    if (!z5) {
                        try {
                            if (!(charSequence instanceof Spannable)) {
                                if ((charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(i - 1, i2 + 1, EmojiSpan.class) <= i2) {
                                    unprecomputeTextOnModificationSpannable = new UnprecomputeTextOnModificationSpannable();
                                    unprecomputeTextOnModificationSpannable.a = false;
                                    unprecomputeTextOnModificationSpannable.b = new SpannableString(charSequence);
                                }
                            } else {
                                try {
                                    unprecomputeTextOnModificationSpannable = new UnprecomputeTextOnModificationSpannable((Spannable) charSequence);
                                } catch (Throwable th2) {
                                    th = th2;
                                    charSequence2 = charSequence;
                                    th = th;
                                    if (z5) {
                                        ((SpannableBuilder) charSequence2).b();
                                        throw th;
                                    }
                                    throw th;
                                }
                            }
                            if (unprecomputeTextOnModificationSpannable != null && (emojiSpanArr = (EmojiSpan[]) unprecomputeTextOnModificationSpannable.b.getSpans(i, i2, EmojiSpan.class)) != null && emojiSpanArr.length > 0) {
                                for (EmojiSpan emojiSpan : emojiSpanArr) {
                                    spanStart = unprecomputeTextOnModificationSpannable.b.getSpanStart(emojiSpan);
                                    int spanEnd = unprecomputeTextOnModificationSpannable.b.getSpanEnd(emojiSpan);
                                    if (spanStart != i2) {
                                        unprecomputeTextOnModificationSpannable.removeSpan(emojiSpan);
                                    }
                                    i = Math.min(spanStart, i);
                                    i2 = Math.max(spanEnd, i2);
                                }
                            }
                            i3 = i;
                            i4 = i2;
                            if (i3 != i4 || i3 >= charSequence.length()) {
                                charSequence2 = charSequence;
                                if (!z5) {
                                    return charSequence2;
                                }
                            } else {
                                charSequence2 = charSequence;
                                try {
                                    UnprecomputeTextOnModificationSpannable unprecomputeTextOnModificationSpannable2 = (UnprecomputeTextOnModificationSpannable) emojiProcessor.c(charSequence2, i3, i4, Integer.MAX_VALUE, false, new EmojiProcessor.EmojiProcessAddSpanCallback(unprecomputeTextOnModificationSpannable, emojiProcessor.a));
                                    if (unprecomputeTextOnModificationSpannable2 != null) {
                                        Spannable spannable = unprecomputeTextOnModificationSpannable2.b;
                                        if (z5) {
                                            ((SpannableBuilder) charSequence2).b();
                                        }
                                        return spannable;
                                    }
                                    if (!z5) {
                                        return charSequence2;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    th = th;
                                    if (z5) {
                                        ((SpannableBuilder) charSequence2).b();
                                        throw th;
                                    }
                                    throw th;
                                }
                            }
                            ((SpannableBuilder) charSequence2).b();
                            return charSequence2;
                        } catch (Throwable th4) {
                            th = th4;
                            charSequence2 = charSequence;
                        }
                    } else {
                        unprecomputeTextOnModificationSpannable = new UnprecomputeTextOnModificationSpannable((Spannable) charSequence);
                        if (unprecomputeTextOnModificationSpannable != null) {
                            while (i < r2) {
                                spanStart = unprecomputeTextOnModificationSpannable.b.getSpanStart(emojiSpan);
                                int spanEnd2 = unprecomputeTextOnModificationSpannable.b.getSpanEnd(emojiSpan);
                                if (spanStart != i2) {
                                    unprecomputeTextOnModificationSpannable.removeSpan(emojiSpan);
                                }
                                i = Math.min(spanStart, i);
                                i2 = Math.max(spanEnd2, i2);
                            }
                        }
                        i3 = i;
                        i4 = i2;
                        if (i3 != i4) {
                            charSequence2 = charSequence;
                            if (!z5) {
                                return charSequence2;
                            }
                        } else {
                            charSequence2 = charSequence;
                            if (!z5) {
                                return charSequence2;
                            }
                        }
                        ((SpannableBuilder) charSequence2).b();
                        return charSequence2;
                    }
                    if (z5) {
                        ((SpannableBuilder) charSequence2).b();
                        throw th;
                    }
                    throw th;
                }
                d.r("end cannot be negative");
                return null;
            }
            d.r("start cannot be negative");
            return null;
        }
        e32.i("Not initialized yet");
        return null;
    }

    public final void i(EditorInfo editorInfo) {
        int i;
        if (b() != 1 || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        CompatInternal19 compatInternal19 = this.e;
        compatInternal19.getClass();
        Bundle bundle = editorInfo.extras;
        MetadataList metadataList = compatInternal19.c.a;
        int iA = metadataList.a(4);
        if (iA != 0) {
            i = metadataList.b.getInt(iA + metadataList.a);
        } else {
            i = 0;
        }
        bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", i);
        editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
    }
}
