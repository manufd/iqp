package devicecloud;

import java.io.InputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class Converter <T>{

	private final Class<T> typeParameterClass;
		
	public Class<T> getTypeParameterClass() {
		return typeParameterClass;
	}


	public Converter(Class<T> typeParameterClass) {
		this.typeParameterClass = typeParameterClass;
	}


	public T convert(InputStream xmlStream) throws JAXBException
	{
		JAXBContext jaxbContext = createJaxbContext();
		Unmarshaller jaxbUnmarshaller = createUnmarshaller(jaxbContext);
		T result = (T) jaxbUnmarshaller.unmarshal(xmlStream);
		return result;
	}


	JAXBContext createJaxbContext() throws JAXBException {
		return JAXBContext.newInstance(typeParameterClass);
	}


	Unmarshaller createUnmarshaller(JAXBContext jaxbContext) throws JAXBException {
		return jaxbContext.createUnmarshaller();
	}
	
}
