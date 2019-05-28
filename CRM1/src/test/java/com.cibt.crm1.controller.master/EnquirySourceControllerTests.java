package com.cibt.crm1.controller.master;

import com.diffblue.deeptestutils.Reflector;
import com.cibt.crm1.service.EnquirySourceService;
import com.cibt.crm1.dto.EnquirySourceDTO;
import org.junit.Assert;
import org.junit.Test;
import org.powermock.api.mockito.PowerMockito;
import org.springframework.ui.Model;

public class EnquirySourceControllerTests {

    @Test
    public void testIndex() {
        Model model = PowerMockito.mock(Model.class);
        EnquirySourceService ess =
                PowerMockito.mock(EnquirySourceService.class);
        EnquirySourceController esc = new EnquirySourceController();
        Reflector.setField(esc, "service", ess);

        Assert.assertEquals("master/enquirysource/index", esc.index(model));
    }

    @Test
    public void testEdit() {
        Model model = PowerMockito.mock(Model.class);
        EnquirySourceService ess =
                PowerMockito.mock(EnquirySourceService.class);
        EnquirySourceController esc = new EnquirySourceController();
        Reflector.setField(esc, "service", ess);

        Assert.assertEquals("master/enquirysource/edit", esc.edit(0, model));
    }

    @Test
    public void testSave() {
        EnquirySourceController esc = new EnquirySourceController();
        EnquirySourceDTO model = PowerMockito.mock(EnquirySourceDTO.class);
        EnquirySourceService ess =
                PowerMockito.mock(EnquirySourceService.class);
        Reflector.setField(esc, "service", ess);

        Assert.assertEquals("redirect:/admin/master/enquiry/source",
                esc.save(model));
    }

    @Test
    public void testDelete() {
        EnquirySourceController esc = new EnquirySourceController();
        EnquirySourceService ess =
                PowerMockito.mock(EnquirySourceService.class);
        Reflector.setField(esc, "service", ess);

        Assert.assertEquals("redirect:/admin/master/enquiry/source",
                esc.delete(0));
    }
}
