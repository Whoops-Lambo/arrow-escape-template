package androidx.emoji2.viewsintegration;

import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import androidx.annotation.RequiresApi;
import androidx.core.util.Preconditions;
import androidx.emoji2.text.EmojiCompat;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class EmojiEditTextHelper {
    public final HelperInternal19 a;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class HelperInternal {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @RequiresApi
    public static class HelperInternal19 extends HelperInternal {
        public final EditText a;
        public final EmojiTextWatcher b;

        public HelperInternal19(EditText editText) {
            this.a = editText;
            EmojiTextWatcher emojiTextWatcher = new EmojiTextWatcher(editText);
            this.b = emojiTextWatcher;
            editText.addTextChangedListener(emojiTextWatcher);
            if (EmojiEditableFactory.b == null) {
                synchronized (EmojiEditableFactory.a) {
                    try {
                        if (EmojiEditableFactory.b == null) {
                            EmojiEditableFactory emojiEditableFactory = new EmojiEditableFactory();
                            try {
                                EmojiEditableFactory.c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, EmojiEditableFactory.class.getClassLoader());
                            } catch (Throwable unused) {
                            }
                            EmojiEditableFactory.b = emojiEditableFactory;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            editText.setEditableFactory(EmojiEditableFactory.b);
        }
    }

    public final KeyListener a(KeyListener keyListener) {
        this.a.getClass();
        if (keyListener instanceof EmojiKeyListener) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new EmojiKeyListener(keyListener);
    }

    public final InputConnection b(InputConnection inputConnection, EditorInfo editorInfo) {
        if (inputConnection == null) {
            return null;
        }
        HelperInternal19 helperInternal19 = this.a;
        helperInternal19.getClass();
        return inputConnection instanceof EmojiInputConnection ? inputConnection : new EmojiInputConnection(helperInternal19.a, inputConnection, editorInfo);
    }

    public final void c(boolean z) throws Throwable {
        EmojiTextWatcher emojiTextWatcher = this.a.b;
        if (emojiTextWatcher.c != z) {
            if (emojiTextWatcher.b != null) {
                EmojiCompat emojiCompatA = EmojiCompat.a();
                EmojiCompat.InitCallback initCallback = emojiTextWatcher.b;
                emojiCompatA.getClass();
                Preconditions.c(initCallback, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = emojiCompatA.a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    emojiCompatA.b.remove(initCallback);
                    reentrantReadWriteLock.writeLock().unlock();
                } catch (Throwable th) {
                    reentrantReadWriteLock.writeLock().unlock();
                    throw th;
                }
            }
            emojiTextWatcher.c = z;
            if (z) {
                EmojiTextWatcher.a(emojiTextWatcher.a, EmojiCompat.a().b());
            }
        }
    }

    public EmojiEditTextHelper(EditText editText) {
        this.a = new HelperInternal19(editText);
    }
}
