package registrationportlet.portlet;

import registrationportlet.constants.RegistrationportletPortletKeys;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import javax.portlet.Portlet;

import org.osgi.service.component.annotations.Component;
import com.example.events.model.Event;
import com.example.events.model.Registration;
import com.example.events.service.EventLocalService;
import com.example.events.service.RegistrationLocalService;
import com.liferay.portal.kernel.exception.PortalException;

import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;

import java.util.Date;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Reference;
/**
 * @author mac
 */
@Component(
	property = {
		"com.liferay.portlet.display-category=category.Event",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=Registrations List",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/registrationsList.jsp",
		"javax.portlet.name=registrationportlet_RegistrationListPortlet",
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class RegistrationsListPortlet extends MVCPortlet {

}