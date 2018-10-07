package sukuma.uam.mail.pbru.ac.th.funnyquestion.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import sukuma.uam.mail.pbru.ac.th.funnyquestion.R;
import sukuma.uam.mail.pbru.ac.th.funnyquestion.utility.MyConstant;

public class Unit1Fragment extends Fragment {

    //Explicit

    private MyConstant myConstant = new MyConstant();


    public static Unit1Fragment unit1Instance(String uidString) {
        Unit1Fragment unit1Fragment = new Unit1Fragment();
        Bundle bundle = new Bundle();
        bundle.putString("Uid", uidString);
        unit1Fragment.setArguments(bundle);
        return unit1Fragment;
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);


        //  First Spinner

        firstSpinner();

        secondSpinner();

        thirdSpinner();

        // Answer4 controller
        answer4Controller();

        item1Spinner();
        item2Spinner();
        item3Spinner();
        item4Spinner();
        item5Spinner();
        item6Spinner();


    }  //Main Method

    private void item1Spinner() {
        Spinner spinner = getView().findViewById(R.id.spinnerItem1);
        String[] strings = myConstant.getChoiceSpinnerItemStrings();
        ArrayAdapter<String> stringArrayAdapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, strings);
        spinner.setAdapter(stringArrayAdapter);

    }

    private void item2Spinner() {
        Spinner spinner = getView().findViewById(R.id.spinnerItem2);
        String[] strings = myConstant.getChoiceSpinnerItemStrings();
        ArrayAdapter<String> stringArrayAdapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, strings);
        spinner.setAdapter(stringArrayAdapter);

    }

    private void item3Spinner() {
        Spinner spinner = getView().findViewById(R.id.spinnerItem3);
        String[] strings = myConstant.getChoiceSpinnerItemStrings();
        ArrayAdapter<String> stringArrayAdapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, strings);
        spinner.setAdapter(stringArrayAdapter);

    }

    private void item4Spinner() {
        Spinner spinner = getView().findViewById(R.id.spinnerItem4);
        String[] strings = myConstant.getChoiceSpinnerItemStrings();
        ArrayAdapter<String> stringArrayAdapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, strings);
        spinner.setAdapter(stringArrayAdapter);

    }

    private void item5Spinner() {
        Spinner spinner = getView().findViewById(R.id.spinnerItem5);
        String[] strings = myConstant.getChoiceSpinnerItemStrings();
        ArrayAdapter<String> stringArrayAdapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, strings);
        spinner.setAdapter(stringArrayAdapter);

    }

    private void item6Spinner() {
        Spinner spinner = getView().findViewById(R.id.spinnerItem6);
        String[] strings = myConstant.getChoiceSpinnerItemStrings();
        ArrayAdapter<String> stringArrayAdapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, strings);
        spinner.setAdapter(stringArrayAdapter);

    }


    private void answer4Controller() {
        EditText editText = getView().findViewById(R.id.edtAnswer);

    }

    private void firstSpinner() {
        Spinner spinner = getView().findViewById(R.id.spinner1);
        String[] strings = myConstant.getChoiceSpinner1Strings();
        ArrayAdapter<String> stringArrayAdapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, strings);
        spinner.setAdapter(stringArrayAdapter);

    }

    private void secondSpinner() {
        Spinner spinner = getView().findViewById(R.id.spinner2);
        String[] strings = myConstant.getChoiceSpinner2Strings();
        ArrayAdapter<String> stringArrayAdapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, strings);
        spinner.setAdapter(stringArrayAdapter);

    }

    private void thirdSpinner() {
        Spinner spinner = getView().findViewById(R.id.spinner3);
        String[] strings = myConstant.getChoiceSpinner3Strings();
        ArrayAdapter<String> stringArrayAdapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, strings);
        spinner.setAdapter(stringArrayAdapter);

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_unit1, container, false);
        return view;
    }
}
