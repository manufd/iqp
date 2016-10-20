package devicecloud;

import java.io.InputStream;

import javax.naming.spi.DirStateFactory.Result;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class ConverterTest {
	
	@Mock
	InputStream xmlStream;
	@Mock
	JAXBContext jaxbContext;
	@Mock
	Unmarshaller jaxbUnmarshaller;
	@Mock
	Result result;
	
	@Test
	public void convertTest() throws JAXBException{
		Converter<Result> converter = new Converter<>(Result.class);
		Converter<Result> converterSpy = Mockito.spy(converter);
		Mockito.when(converterSpy.createJaxbContext()).thenReturn(jaxbContext);
		Mockito.when(converterSpy.createUnmarshaller(jaxbContext)).thenReturn(jaxbUnmarshaller);
		Mockito.when(jaxbUnmarshaller.unmarshal(xmlStream)).thenReturn(result);
		Result result = converterSpy.convert(xmlStream);
		Assert.assertNotNull(result);
	}
}