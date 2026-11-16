package androidx.preference;

import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import androidx.p003activity.result.ActivityResultCaller;
import com.ironsource.C4664b4;
import defpackage.e32;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class PreferenceDialogFragmentCompat extends DialogFragment implements DialogInterface.OnClickListener {
    public DialogPreference a;
    public CharSequence b;
    public CharSequence c;
    public CharSequence d;
    public CharSequence e;
    public int f;
    public BitmapDrawable g;
    public int h;

    public abstract void f(boolean z);

    public void g(AlertDialog.Builder builder) {
    }

    public final DialogPreference d() {
        if (this.a == null) {
            getArguments().getString(C4664b4.i.W);
            ((DialogPreference.TargetFragment) getTargetFragment()).a();
            this.a = null;
        }
        return this.a;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.h = i;
    }

    public void e(View view) {
        int i;
        View viewFindViewById = view.findViewById(android.R.id.message);
        if (viewFindViewById != null) {
            CharSequence charSequence = this.e;
            if (!TextUtils.isEmpty(charSequence)) {
                if (viewFindViewById instanceof TextView) {
                    ((TextView) viewFindViewById).setText(charSequence);
                }
                i = 0;
            } else {
                i = 8;
            }
            if (viewFindViewById.getVisibility() != i) {
                viewFindViewById.setVisibility(i);
            }
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ActivityResultCaller targetFragment = getTargetFragment();
        if (targetFragment instanceof DialogPreference.TargetFragment) {
            DialogPreference.TargetFragment targetFragment2 = (DialogPreference.TargetFragment) targetFragment;
            getArguments().getString(C4664b4.i.W);
            if (bundle != null) {
                this.b = bundle.getCharSequence("PreferenceDialogFragment.title");
                this.c = bundle.getCharSequence("PreferenceDialogFragment.positiveText");
                this.d = bundle.getCharSequence("PreferenceDialogFragment.negativeText");
                this.e = bundle.getCharSequence("PreferenceDialogFragment.message");
                this.f = bundle.getInt("PreferenceDialogFragment.layout", 0);
                Bitmap bitmap = (Bitmap) bundle.getParcelable("PreferenceDialogFragment.icon");
                if (bitmap != null) {
                    this.g = new BitmapDrawable(getResources(), bitmap);
                    return;
                }
                return;
            }
            targetFragment2.a();
            this.a = null;
            throw null;
        }
        e32.i("Target fragment must implement TargetFragment interface");
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        FragmentActivity activity = getActivity();
        this.h = -2;
        AlertDialog.Builder title = new AlertDialog.Builder(activity).setTitle(this.b);
        BitmapDrawable bitmapDrawable = this.g;
        AlertController.AlertParams alertParams = title.a;
        alertParams.c = bitmapDrawable;
        alertParams.g = this.c;
        alertParams.h = this;
        alertParams.i = this.d;
        alertParams.j = this;
        int i = this.f;
        View viewInflate = null;
        if (i != 0) {
            viewInflate = getLayoutInflater().inflate(i, (ViewGroup) null);
        }
        if (viewInflate != null) {
            e(viewInflate);
            title.setView(viewInflate);
        } else {
            title.a.f = this.e;
        }
        g(title);
        AlertDialog alertDialogCreate = title.create();
        if (this instanceof EditTextPreferenceDialogFragmentCompat) {
            alertDialogCreate.getWindow().setSoftInputMode(5);
        }
        return alertDialogCreate;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        boolean z;
        super.onDismiss(dialogInterface);
        if (this.h == -1) {
            z = true;
        } else {
            z = false;
        }
        f(z);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("PreferenceDialogFragment.title", this.b);
        bundle.putCharSequence("PreferenceDialogFragment.positiveText", this.c);
        bundle.putCharSequence("PreferenceDialogFragment.negativeText", this.d);
        bundle.putCharSequence("PreferenceDialogFragment.message", this.e);
        bundle.putInt("PreferenceDialogFragment.layout", this.f);
        BitmapDrawable bitmapDrawable = this.g;
        if (bitmapDrawable != null) {
            bundle.putParcelable("PreferenceDialogFragment.icon", bitmapDrawable.getBitmap());
        }
    }
}
