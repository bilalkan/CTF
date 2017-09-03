package android.support.v4.os;

import android.os.CancellationSignal;
import android.support.annotation.RequiresApi;

@RequiresApi(16)
class CancellationSignalCompatJellybean {
    CancellationSignalCompatJellybean() {
    }

    public static Object create() {
        return new CancellationSignal();
    }

    public static void cancel(Object cancellationSignalObj) {
        ((CancellationSignal) cancellationSignalObj).cancel();
    }
}
