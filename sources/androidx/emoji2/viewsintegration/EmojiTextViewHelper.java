package androidx.emoji2.viewsintegration;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;
import androidx.annotation.RequiresApi;
import androidx.appcompat.text.AllCapsTransformationMethod;
import androidx.emoji2.text.EmojiCompat;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class EmojiTextViewHelper {
    public final HelperInternal a;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class HelperInternal {
        public InputFilter[] a(InputFilter[] inputFilterArr) {
            return inputFilterArr;
        }

        public boolean b() {
            return false;
        }

        public void c(boolean z) {
        }

        public void d(boolean z) {
        }

        public TransformationMethod e(TransformationMethod transformationMethod) {
            return transformationMethod;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @RequiresApi
    public static class HelperInternal19 extends HelperInternal {
        public final TextView a;
        public final EmojiInputFilter b;
        public boolean c = true;

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        public final InputFilter[] a(InputFilter[] inputFilterArr) {
            if (!this.c) {
                SparseArray sparseArray = new SparseArray(1);
                for (int i = 0; i < inputFilterArr.length; i++) {
                    InputFilter inputFilter = inputFilterArr[i];
                    if (inputFilter instanceof EmojiInputFilter) {
                        sparseArray.put(i, inputFilter);
                    }
                }
                if (sparseArray.size() == 0) {
                    return inputFilterArr;
                }
                int length = inputFilterArr.length;
                InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
                int i2 = 0;
                for (int i3 = 0; i3 < length; i3++) {
                    if (sparseArray.indexOfKey(i3) < 0) {
                        inputFilterArr2[i2] = inputFilterArr[i3];
                        i2++;
                    }
                }
                return inputFilterArr2;
            }
            int length2 = inputFilterArr.length;
            int i4 = 0;
            while (true) {
                EmojiInputFilter emojiInputFilter = this.b;
                if (i4 >= length2) {
                    InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                    System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                    inputFilterArr3[length2] = emojiInputFilter;
                    return inputFilterArr3;
                }
                if (inputFilterArr[i4] == emojiInputFilter) {
                    return inputFilterArr;
                }
                i4++;
            }
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        public final boolean b() {
            return this.c;
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        public final void c(boolean z) {
            if (z) {
                TextView textView = this.a;
                textView.setTransformationMethod(e(textView.getTransformationMethod()));
            }
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        public final void d(boolean z) {
            this.c = z;
            TextView textView = this.a;
            textView.setTransformationMethod(e(textView.getTransformationMethod()));
            textView.setFilters(a(textView.getFilters()));
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        public final TransformationMethod e(TransformationMethod transformationMethod) {
            if (this.c) {
                return ((transformationMethod instanceof EmojiTransformationMethod) || (transformationMethod instanceof PasswordTransformationMethod)) ? transformationMethod : new EmojiTransformationMethod(transformationMethod);
            }
            return transformationMethod instanceof EmojiTransformationMethod ? ((EmojiTransformationMethod) transformationMethod).a : transformationMethod;
        }

        public HelperInternal19(TextView textView) {
            this.a = textView;
            this.b = new EmojiInputFilter(textView);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @RequiresApi
    public static class SkippingHelper19 extends HelperInternal {
        public final HelperInternal19 a;

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        public final InputFilter[] a(InputFilter[] inputFilterArr) {
            return !(EmojiCompat.k != null) ? inputFilterArr : this.a.a(inputFilterArr);
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        public final boolean b() {
            return this.a.c;
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        public final void c(boolean z) {
            if (EmojiCompat.k != null) {
                this.a.c(z);
            }
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        public final void d(boolean z) {
            boolean z2 = EmojiCompat.k != null;
            HelperInternal19 helperInternal19 = this.a;
            if (z2) {
                helperInternal19.d(z);
            } else {
                helperInternal19.c = z;
            }
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        public final TransformationMethod e(TransformationMethod transformationMethod) {
            return !(EmojiCompat.k != null) ? transformationMethod : this.a.e(transformationMethod);
        }

        public SkippingHelper19(TextView textView) {
            this.a = new HelperInternal19(textView);
        }
    }

    public final InputFilter[] a(InputFilter[] inputFilterArr) {
        return this.a.a(inputFilterArr);
    }

    public final boolean b() {
        return this.a.b();
    }

    public final void c(boolean z) {
        this.a.c(z);
    }

    public final void d(boolean z) {
        this.a.d(z);
    }

    public final TransformationMethod e(AllCapsTransformationMethod allCapsTransformationMethod) {
        return this.a.e(allCapsTransformationMethod);
    }

    public EmojiTextViewHelper(TextView textView) {
        this.a = new SkippingHelper19(textView);
    }
}
