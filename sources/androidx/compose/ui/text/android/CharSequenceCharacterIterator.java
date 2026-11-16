package androidx.compose.ui.text.android;

import defpackage.d;
import java.text.CharacterIterator;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/android/CharSequenceCharacterIterator;", "Ljava/text/CharacterIterator;", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class CharSequenceCharacterIterator implements CharacterIterator {
    public final CharSequence a;
    public final int b;
    public int c;

    @Override // java.text.CharacterIterator
    public final char first() {
        this.c = 0;
        return current();
    }

    @Override // java.text.CharacterIterator
    public final int getBeginIndex() {
        return 0;
    }

    @Override // java.text.CharacterIterator
    public final char current() {
        int i = this.c;
        if (i == this.b) {
            return (char) 65535;
        }
        return this.a.charAt(i);
    }

    @Override // java.text.CharacterIterator
    public final int getEndIndex() {
        return this.b;
    }

    @Override // java.text.CharacterIterator
    public final int getIndex() {
        return this.c;
    }

    @Override // java.text.CharacterIterator
    public final char last() {
        int i = this.b;
        if (i == 0) {
            this.c = i;
            return (char) 65535;
        }
        int i2 = i - 1;
        this.c = i2;
        return this.a.charAt(i2);
    }

    @Override // java.text.CharacterIterator
    public final char next() {
        int i = this.c + 1;
        this.c = i;
        int i2 = this.b;
        if (i < i2) {
            return this.a.charAt(i);
        }
        this.c = i2;
        return (char) 65535;
    }

    @Override // java.text.CharacterIterator
    public final char previous() {
        int i = this.c;
        if (i <= 0) {
            return (char) 65535;
        }
        int i2 = i - 1;
        this.c = i2;
        return this.a.charAt(i2);
    }

    @Override // java.text.CharacterIterator
    public final char setIndex(int i) {
        if (i > this.b || i < 0) {
            d.r("invalid position");
            return (char) 0;
        }
        this.c = i;
        return current();
    }

    public CharSequenceCharacterIterator(int i, CharSequence charSequence) {
        charSequence.getClass();
        this.a = charSequence;
        this.b = i;
        this.c = 0;
    }

    @Override // java.text.CharacterIterator
    public final Object clone() {
        try {
            Object objClone = super.clone();
            objClone.getClass();
            return objClone;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }
}
