/*
 * Copyright 2013 Prateek Srivastava (@f2prateek)
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.f2prateek.cloak;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;
import butterknife.Views;

/**
 * The base fragment class you should extend from.
 * It injects itself into {@link com.f2prateek.cloak.CloakedActivity#activityGraph} in it's {@link
 * com.f2prateek.cloak.CloakedFragment#onActivityCreated(android.os.Bundle)} method.
 *
 * Views can be injected after a call to {@link com.f2prateek.cloak.CloakedFragment#onViewCreated(android.view.View,
 * android.os.Bundle)}. Be sure to supply your own view in {@link com.f2prateek.cloak.CloakedFragment#onCreateView(android.view.LayoutInflater,
 * android.view.ViewGroup, android.os.Bundle)}.
 */
public class CloakedFragment extends Fragment {
  @Override public void onActivityCreated(Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);
    ((CloakedActivity) getActivity()).inject(this);
  }

  @Override public void onViewCreated(View view, Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);
    Views.inject(this, view);
  }
}
