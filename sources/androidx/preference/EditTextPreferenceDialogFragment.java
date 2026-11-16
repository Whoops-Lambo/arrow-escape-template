package androidx.preference;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import defpackage.e32;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Deprecated
public class EditTextPreferenceDialogFragment extends PreferenceDialogFragment {
    public EditText i;
    public CharSequence j;

    @Override // androidx.preference.PreferenceDialogFragment
    public final void c(boolean z) {
        if (z) {
            String string = this.i.getText().toString();
            ((EditTextPreference) a()).getClass();
            ((EditTextPreference) a()).m(string);
        }
    }

    @Override // androidx.preference.PreferenceDialogFragment
    public final void b(View view) {
        super.b(view);
        EditText editText = (EditText) view.findViewById(android.R.id.edit);
        this.i = editText;
        editText.requestFocus();
        EditText editText2 = this.i;
        if (editText2 != null) {
            editText2.setText(this.j);
            EditText editText3 = this.i;
            editText3.setSelection(editText3.getText().length());
            return;
        }
        e32.i("Dialog view must contain an EditText with id @android:id/edit");
    }

    @Override // androidx.preference.PreferenceDialogFragment, android.app.DialogFragment, android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            this.j = ((EditTextPreference) a()).A;
        } else {
            this.j = bundle.getCharSequence("EditTextPreferenceDialogFragment.text");
        }
    }

    @Override // androidx.preference.PreferenceDialogFragment, android.app.DialogFragment, android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("EditTextPreferenceDialogFragment.text", this.j);
    }
}
