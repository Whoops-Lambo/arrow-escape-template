package androidx.preference;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import defpackage.e32;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public class EditTextPreferenceDialogFragmentCompat extends PreferenceDialogFragmentCompat {
    public EditText i;
    public CharSequence j;

    @Override // androidx.preference.PreferenceDialogFragmentCompat
    public final void f(boolean z) {
        if (z) {
            String string = this.i.getText().toString();
            EditTextPreference editTextPreference = (EditTextPreference) d();
            editTextPreference.getClass();
            editTextPreference.m(string);
        }
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat
    public final void e(View view) {
        super.e(view);
        EditText editText = (EditText) view.findViewById(android.R.id.edit);
        this.i = editText;
        if (editText != null) {
            editText.requestFocus();
            this.i.setText(this.j);
            EditText editText2 = this.i;
            editText2.setSelection(editText2.getText().length());
            ((EditTextPreference) d()).getClass();
            return;
        }
        e32.i("Dialog view must contain an EditText with id @android:id/edit");
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            this.j = ((EditTextPreference) d()).A;
        } else {
            this.j = bundle.getCharSequence("EditTextPreferenceDialogFragment.text");
        }
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("EditTextPreferenceDialogFragment.text", this.j);
    }
}
