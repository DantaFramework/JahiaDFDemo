package danta.jahiadfdemo.contextprocessors;

import com.google.common.collect.Sets;
import danta.api.ExecutionContext;
import danta.api.exceptions.ProcessException;
import danta.core.contextprocessors.AbstractCheckComponentCategoryContextProcessor;
import danta.jahia.templating.TemplateContentModel;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang3.StringUtils;
import org.jahia.services.render.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Set;

import static danta.Constants.*;
import static danta.jahia.Constants.JAHIA_RESOURCE;

import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Service;


/**
 * Created by neozilon on 8/29/17.
 */
@Component
@Service
public class GreetingsContextProcessor extends AbstractCheckComponentCategoryContextProcessor<TemplateContentModel> {

    private static final String CP_CATEGORY = "greetings";

    private static final Logger LOG = LoggerFactory.getLogger(GreetingsContextProcessor.class);

    @Override
    public Set<String> anyOf() {
        return Sets.newHashSet(CP_CATEGORY);
    }

    @Override
    public int priority() {
        // This processor must be one of the first processors executed.
        return LOW_PRIORITY;
    }

    @Override
    public void process(final ExecutionContext executionContext, final TemplateContentModel contentModel)throws ProcessException {
        try {
            String greetingMessageKey = "greetingMessage";
            String greetingsMessage = "Hello From Context Processor -> GreetingsContextProcessor :-) ";
            Resource resource = (Resource) executionContext.get(JAHIA_RESOURCE);
            LOG.info("Resource is not null");
            if (resource != null) {
                LOG.info("Resource is not null");
                if (contentModel.has(CONTENT)) {
                    contentModel.set(CONTENT + DOT + greetingMessageKey, greetingsMessage);
                }
            }
        } catch (Exception e) {
            throw new ProcessException(e);
        }
    }
}
