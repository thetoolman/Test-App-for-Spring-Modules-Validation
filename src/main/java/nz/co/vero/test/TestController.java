////////////////////////////////////////////////////////////////////////////////
//
// Copyright (c) 2009, Suncorp Metway Limited. All rights reserved.
//
// This is unpublished proprietary source code of Suncorp Metway Limited.
// The copyright notice above does not evidence any actual or intended
// publication of such source code.
//
////////////////////////////////////////////////////////////////////////////////
package nz.co.vero.test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import nz.co.vero.test.bean.TestBean;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.validation.BindException;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

public class TestController extends SimpleFormController {

    @Override
    protected void initBinder(HttpServletRequest request, ServletRequestDataBinder dataBinder) throws Exception {
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        df.setLenient(false);
        dataBinder.registerCustomEditor(Date.class, new CustomDateEditor(df, false));
        super.initBinder(request, dataBinder);
    }

    static Log log = LogFactory.getLog(TestController.class);

    public Object formBackingObject(HttpServletRequest request) throws ServletException {
        return new TestBean();
    }

    public ModelAndView onSubmit(Object command, BindException errors) throws Exception {

        getValidator().validate(command, errors);

        return new ModelAndView(getSuccessView(), errors.getModel());
    }
}
